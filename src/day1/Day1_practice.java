package day1;

import java.util.Scanner;

public class Day1_practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two strings to compare");
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
