package switchstatment;

public class Colorcode {
	public static void main(String[] args) {
		char c=args[0].charAt(0);
		switch(c) {
		case 'G' -> System.out.println("Green");
		case 'B' -> System.out.println("Blue");
		case 'R' -> System.out.println("Red");
		case 'O' -> System.out.println("Orange");
		case 'Y' -> System.out.println("Yellow");
		case 'W' -> System.out.println("White");
		default -> System.out.println("Invalid Code");
		}
	}
}
