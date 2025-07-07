package array;
import java.util.Scanner;
public class Inttochar {
 public static void main(String[]rgs) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			System.out.print((char)i+" ");
		}
	}
}
