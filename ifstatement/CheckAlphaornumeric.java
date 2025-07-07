package ifstatement;

public class CheckAlphaornumeric {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	if(Character.isAlphabetic(c)) {
		System.out.println("Alphabet");
	}
	else if(Character.isDigit(c)) {
		System.out.println("Digit");
	}
	else {
		System.out.println("Special Character");
	}
}
}
