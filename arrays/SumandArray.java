package array;
import java.util.Scanner;
public class SumandArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	double average;
	for(int i:arr) {
		sum+=i;
	}
	average=sum/n;
	System.out.println("The sume of the given array:"+sum);
	System.out.println("The average of the given array:"+average);
}
}
