package whileloop;

public class Palindrome {
	public static void main(String args[]) {
		int original=Integer.parseInt(args[0]);
		int n=original;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==original) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
