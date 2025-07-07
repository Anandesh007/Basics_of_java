package array;

import java.util.Scanner;

public class CheckingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search element:");
		int search=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.println("The search element is found inb"+i+" index");
				System.exit(0);
			}
		}
		System.out.println("The element is not found");
	}
}
