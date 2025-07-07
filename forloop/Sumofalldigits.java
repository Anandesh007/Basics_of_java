package forloop;

public class Sumofalldigits {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=n;i>0;i/=10) {
			int rem=i%10;
			sum+=rem;
		}
		System.out.println(sum);
	}
}
