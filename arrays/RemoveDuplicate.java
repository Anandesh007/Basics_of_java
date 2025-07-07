package array;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(int i = 0; i < n; i++) {
            uniqueSet.add(arr[i]);
        }

        System.out.println("Array after removing duplicates:");
        for(int num : uniqueSet) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

