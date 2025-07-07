package ifstatement;

public class PositiveorNegative {
public static void main(String[] args)
{
	int n=Integer.parseInt(args[0]);
	if(n>0) {
		System.out.println("Positive Number");
	}
	else if(n==0) {
		System.out.println("Zero");
	}
	else {
		System.out.println("Negative number");
	}
	
}
}