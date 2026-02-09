// observation:-  To minimize the time,make all elements eual to the maximum element in the array.

import java.util.Scanner;

public class MinTimeToEqualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - arr[i]);
        }
        System.out.println(time);
    }
}
