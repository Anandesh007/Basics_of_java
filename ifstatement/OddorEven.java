package ifstatement;

public class OddorEven {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		String result=n%2==0 ? "Even Number" : "Odd Number";
		System.out.println(result);
	}
}
