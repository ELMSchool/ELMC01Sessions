package exception_handling;

import java.util.Scanner;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int a = scan.nextInt();
		
		System.out.println("Please enter the second number: ");
		int b = scan.nextInt();
		
		try {

			System.out.println("Division: " + division(a, b) );
			
			
			System.out.println("Getting 6th character from Hello: " + "Hello".charAt(5));
			
		} catch (IndexOutOfBoundsException iob) {
		
			System.out.println("There is no 6th character of Hello.");
					
		} catch(Exception e) {
			
			System.out.println("Exception encountered. Will give you another chance.");
			
			System.out.println("Please enter the first number again: ");
			a = scan.nextInt();
			
			System.out.println("Please enter the second number again: ");
			b = scan.nextInt();
			
			try {
				System.out.println("Division: " + division(a, b) );
			} catch (Exception e2) {
				System.out.println("Exception encountered. Will NOT give you another chance.");
			}
			
		} finally {
			System.out.println("Finally block!");
		}
		
		
		System.gc();
		System.runFinalization();
	}
	
	
	
	/**
	 * Make sure the value for the second parameter is NOT zero.
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception 
	 */
	public static int division (int a, int b) throws Exception {
		
		return a / b;
	}

	
}









