package session010;

import java.util.Arrays;

/*
 * Given 2 arrays, return true if they are equal.
 * Ex. [] equals []
 * 
 * NOTES / Assumptions / Given:
 * 	- String values
 *  - not necessarily sorted
 *  - not necessarily the same length
 *  - if both empty, then they are equal
 *  
 * Pseudocode:
 * 1. check the same size, if not equal return false
 * 2. sort, it's ok to use Arrays.sort(), but NOT Arrays.equals()
 * 3. declare your loop, start from 0 continue until any array's length
 * 	 - pick elements from both arrays 1-by-1 and 
 * 	 - check if they are equal
 * 		- if any one NOT equal, return false
 * 	 - if I reach the end of the loop and haven't returned false, return true
 */
public class ComparingArrays {

	public static void main(String[] args) {
		
		System.out.println( compareArrays() );
		
	}
	
	
	public static boolean compareArrays() {
		String[] arr1 = {};
		String[] arr2 = {};
		
		if( arr1.length != arr2.length ) {
			return false;
		}
		
		Arrays.sort( arr1 );
		Arrays.sort( arr2 );
		
		for (int i = 0; i < arr1.length; i++) {
			
			if ( arr1[ i ] .equals( arr2 [ i ]  )) {
				continue;
			} else { 
				return false;
			}
			
		}
		
		return true;
	}
	
	// IMPORTANT INTERVIEW NOTES
	// 1. ASK, ASK, ASK QUESTIONS, and make notes
	// 2. TALK HOW YOU'RE GOING TO CODE, and make notes (pseudocode)
	// 3. CREATE TEST CASES as your examples
	//	 ordered from VERY SIMPLE cases to MORE COMPLEX cases
	// 4. Start developing your code, 
	//	 with EASIEST TEST CASES BEING CONSIDERED FIRST
	
}
