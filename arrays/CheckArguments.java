public class CheckArguments {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			for(int i=0;i<args.length;i++) {
				if(i!=args.length-1) {
					System.out.print(args[i]+",");
				}
				else {
					System.out.print(args[i]);
				}
			}
		}
	}
}

/*Write a program to check if the program has received command line argument or not.
 * 
 * if the program has not received arguments then print "No values",else print all the values
 * in a single line separated by ,(comma)
 * 
 * Example1: java CheckArguments
 * O/P:No values
 * 
 * Example2: java CheckArguments Mumbai Bangalore
 * O/P: Mumbai,Bangalore*/
