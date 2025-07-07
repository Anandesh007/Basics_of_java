package array;

import java.util.*;

public class SumWithSkip67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                skip = true;
            }

            if (!skip) {
                sum += arr[i];
            }

            if (skip && arr[i] == 7) {
                skip = false;
            }
        }

        System.out.println("Sum between 6 and 7: " + sum);

        sc.close();
    }
}
