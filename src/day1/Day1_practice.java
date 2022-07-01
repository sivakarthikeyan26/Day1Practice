package day1;


public class Day1_practice {

	public static void main(String args[]) {
		int sum = 0;
		int inv = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				inv++;
			}
			}
		System.out.println("Total no.of arguments: "+args.length);
		System.out.println("Invalid Integers: "+inv);
		System.out.println("Sum: "+sum);
		
	}

}
