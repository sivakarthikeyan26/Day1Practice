package day1;

public class Day1_practice {
	static int a = 3;
	static int b;

	static void m(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		b = a+1;
	}

	public static void main(String args[]) {
		m(20);
	}
}
