
import java.util.Scanner;

public class SumOfUpperDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter matrix element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Upper Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i < j) {
                    System.out.print(a[i][j] + " ");
                    sum = sum + a[i][j];
                    }
                }
            }

        System.out.println("Sum of Upper Elements: " + sum);
    }
}
