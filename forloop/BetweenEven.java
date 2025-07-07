package forloop;

public class BetweenEven {
	public static void main(String[] args) {
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		for(int i=first;i<=last;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
