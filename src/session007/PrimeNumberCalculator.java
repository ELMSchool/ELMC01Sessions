package session007;

import java.util.Scanner;

/*
 * Write a program that uses a nested loop 
 * to calculate the sum of the prime numbers in a given range. 
 * The program should prompt the user to enter 
 * a starting and ending number, 
 * and then use a loop to find and display 
 * the sum of all prime numbers in that range. 
 * The program should use the break statement to exit the loop 
 * when the sum exceeds 1000.
 */
public class PrimeNumberCalculator {
	
	public static void main(String[] args) {
		
		boolean isPrime = isPrime( 11 );
		System.out.println("Is prime return: " + isPrime);
		
		/*
		 * The program should prompt the user to enter 
		 * a starting and ending number,
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter starting point: ");
		int startingPoint = input.nextInt();
		
		System.out.println("Please enter ending point: ");
		int endingPoint = input.nextInt();
		
		/*
		 * and then use a loop to find and display 
	 	 * the sum of all prime numbers in that range.
	 	 * The program should exit the loop when the sum exceeds 1000.
		 */
		int sum = 0;
		
		startingPoint = startingPoint + 1;
		while (startingPoint < endingPoint) {
			
			System.out.println("Current point: " + startingPoint);
			
			if ( isPrime( startingPoint ) ) {
				sum = sum + startingPoint;
				System.out.println("Prime found: " + startingPoint);
			}
			
			
			if (sum > 1000) {
				break;
			}
			
			startingPoint++;
		}
		
		
		
		System.out.println("Sum = " + sum);
	}
	
	/**
	 * This method will accept an int value
	 * and will return whether that int number is
	 * a prime or not. True if a prime, False if not.
	 * @param number is an int value
	 * @return true (if prime) or false (if not prime)
	 */
	public static boolean isPrime( int number ) {
		boolean returnValue = true;
		
		
		for (int x = 2; x < number; x ++) {
			
			if (number % x == 0) {
				returnValue = false;
				break;
			}
			
		}
		
		
		return returnValue;
	}
	
	

}
