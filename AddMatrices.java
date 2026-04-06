import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Enter elements of first matrix:");
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) a[i][j] = in.nextInt();
        System.out.println("Enter elements of second matrix:");
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) b[i][j] = in.nextInt();
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                sum[i][j] = a[i][j] + b[i][j];
        System.out.println("Sum matrix:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) System.out.print(sum[i][j] + " ");
            System.out.println();
        }}}

