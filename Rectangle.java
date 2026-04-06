class Rectangle {
    private int length, breadth;

    private Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    private Rectangle(int side) {
        this(side, side);     // fill 1
    }

    private Rectangle() {
        this(0);              // fill 2
    }

    public int area() {
        return length * breadth; // fill 3
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle();
        System.out.println("Rectangle 1: Area = " + r1.area());
        System.out.println("Rectangle 2: Area = " + r2.area());
        System.out.println("Rectangle 3: Area = " + r3.area());
    }
}

