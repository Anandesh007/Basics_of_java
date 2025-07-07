package array;

import java.util.Scanner;

public class SecLargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int small1=arr[0],large1=arr[n-1];
		int small2=0,large2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large1) {
				large2=large1;
				large1=arr[i];
			}
			else if(arr[i]<small1) {
				small2=small1;
				small1=arr[i];
			}
		}
		System.out.println("The first and second minimum number is: "+small1+" and "+small2);
		System.out.println("The first and second maximum number is: "+large1+" and "+large2);
}
}
