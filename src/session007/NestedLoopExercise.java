package session007;

public class NestedLoopExercise {
	
	/*
	 * Write a program that uses a nested loop to generate 
	 * a "triangle" pattern of asterisks 
	 * of a user-specified size.
	 * 
	 * 		*
	 * 	   * *
	 *    * * *
	 */
	
	public static void main(String[] args) {
		
	System.out.println("The pattern I SHOULD get:");
		System.out.println("  *  ");
		System.out.println(" * * ");
		System.out.println("* * *");
		
		System.out.println("The pattern I am ACTUALLY getting:");
		// in each iteration, I have 1 MORE star
		// for 3 iterations, 1st 1 star, 2nd 2 stars, 3rd 3 stars
		
		// OUTER loop
		myOuterLoop :
		for (int i = 0; i < 10; i++) {
			
//			System.out.println("Value of i: " + i);
			
			// INNER loop
			for (int y = 0; y < i + 1; y++) {
				System.out.print(" * ");
				
				if ( y == 5) {
					continue myOuterLoop;
				}
			}
			
			System.out.println();
			
//			if (i == 0) {
//				System.out.println("*");
//			}else if (i == 1) {
//				System.out.println("**");
//			}else {
//				System.out.println("***");
//			}
//			System.out.println(" * ");			
			
		}
		
//		System.out.println("Trying to print sideways:");
//		for (int y = 0; y < 1; y++) {
//			System.out.print(" * ");
//		}
//		System.out.println();
//		for (int y = 0; y < 2; y++) {
//			System.out.print(" * ");
//		}
//		System.out.println();
//		for (int y = 0; y < 3; y++) {
//			System.out.print(" * ");
//		}
	}

}
