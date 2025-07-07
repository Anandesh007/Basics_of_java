package array;

import java.util.Scanner;

public class Minmax {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int min=arr[0],max=arr[n-1];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		else if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("The minimum number is:"+min);
	System.out.println("The maximum number is:"+max);
}
}
