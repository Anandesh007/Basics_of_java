package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of an array");
    	int n=sc.nextInt();
    	int[] numbers=new int[n];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<n;i++) {
    		numbers[i]=sc.nextInt();
    	}
        Arrays.sort(numbers);

        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

