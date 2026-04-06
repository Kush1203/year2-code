import java.util.Scanner;

class LinearEquation {
    double a, b, c, d, e, f;
    private double x, y;

    public LinearEquation(double a, double b, double c,
                          double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c != 0);
    }

    public void solve() {
        if (!isSolvable()) return;
        double den = (a * d - b * c);
        x = (e * d - b * f) / den;
        y = (a * f - e * c) / den;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}

class Line {
    double x1, y1, x2, y2;   // package access so LinearEquation builder can see

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public LinearEquation intersectingEquation(Line anotherLine) {
        double a1 = y1 - y2;
        double b1 = x1 - x2;
        double e1 = x2 * y1 - x1 * y2;

        double a2 = anotherLine.y1 - anotherLine.y2;
        double b2 = anotherLine.x1 - anotherLine.x2;
        double e2 = anotherLine.x2 * anotherLine.y1 - anotherLine.x1 * anotherLine.y2;

        return new LinearEquation(a1, b1, a2, b2, e1, e2);
    }
}

public class t4q1updated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1 y1 x2 y2 for first line: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.print("Enter x3 y3 x4 y4 for second line: ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();

        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(x3, y3, x4, y4);

        LinearEquation eq = l1.intersectingEquation(l2);
        if (!eq.isSolvable()) {
            System.out.println("Lines are parallel; no unique intersection.");
        } else {
            eq.solve();
            System.out.println("Intersection at: (" + eq.getX() + ", " + eq.getY() + ")");
        }

        in.close();
    }
}

