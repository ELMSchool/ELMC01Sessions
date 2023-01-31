package session007;

import java.util.Scanner;
/*
 * We'll be given a number, and a range,
 * we'll need to return the result of
 * the number divided by every integer in the range.
 * Ex. given 10, and given 2 and 5,
 * return 5, 3, 2, 2
 * (10 / 2 = 5; 10 / 3 = 3; 10 / 4 = 2; 10 / 5 = 2)
 */
public class AvoidingDefect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What number do you want to divide?");
		int mainNumber = scanner.nextInt();
		
		System.out.println("What's the starting point of the range that "
				+ "you want this number to be divided by?");
		int start = scanner.nextInt();
		
		System.out.println("What's the ending point of the range that "
				+ "you want this number to be divided by?");
		int end = scanner.nextInt();
		
		
		for( ; start <= end; start++) {
			
			if (start == 0) {
				System.out.println("Defective part of the code is FIXED. Won't divide by 0, skipping this iteration");
				continue;
			}
			
			// Result of 10 / 2 = 5
			System.out.println("Result of " + mainNumber + " / " + start + " = " + (mainNumber / start) );
			
		}
		
	}
}
