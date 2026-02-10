import java.util.Scanner;

public class SumOfRowMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int r = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }
            System.out.println("sum of row" + (i + 1) + "=" + sum);
        }
    }
}
