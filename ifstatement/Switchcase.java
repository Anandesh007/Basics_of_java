package ifstatement;

public class Switchcase {
public static void main(String[] args) {
	int c=args[0].charAt(0);
	char c1;
	if(c>=97) {
		c1=(char)(c-32);
	}
	else {
		c1=(char)(c+32);
	}
	System.out.println(c1);
}
}
