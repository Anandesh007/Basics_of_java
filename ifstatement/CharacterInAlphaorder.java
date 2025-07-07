package ifstatement;

public class CharacterInAlphaorder {
public static void main(String[] args) {
	if(args.length>1) {
		System.out.println("Please give one argument");
		System.exit(0);
	}
	char first=args[0].charAt(0);
	char second=args[0].charAt(1);
	if(first>second) {
		System.out.println(second+","+(char)first);
	}
	else {
		System.out.println((char)first+","+(char)second);
	}
}
}
