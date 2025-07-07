package forloop;

public class PrimeNumbers {
	boolean isPrime(int n) {
		int count=1;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				count++;
			}
		}
		return count==1;
	}
	public static void main(String[] args) {
		PrimeNumbers obj=new PrimeNumbers();
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		for(int i=first;i<last;i++) {
			if(obj.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
