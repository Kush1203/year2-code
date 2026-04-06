import java.util.Scanner;

class Dice {
    int wins = 0, total = 0;

    public void play(int ug) {
        int cg = 1 + (int)(Math.random() * 6);
        if (cg == ug) {
            wins++;
        }
        total++;
    }

    public void display() {
        System.out.println("you have played= " + total + " and won= " + wins);
    }
}

public class tq1{
    public static void main(String[] args) {
        Dice d = new Dice();
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("whats your guess from 1–6? ");
            int n = inp.nextInt();
            if (n == 0) break;
            d.play(n);
        } while (true);
        d.display();
        inp.close();
    }
}

