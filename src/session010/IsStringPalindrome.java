package session010;

/*
 * Find out if a String is palindrome.
 */
//IMPORTANT INTERVIEW NOTES
// 1. ASK, ASK, ASK QUESTIONS, and make notes
// 2. TALK HOW YOU'RE GOING TO CODE, and make notes (pseudocode)
// 3. CREATE TEST CASES as your examples
//	 ordered from VERY SIMPLE cases to MORE COMPLEX cases
// 4. Start developing your code, 
//	 with EASIEST TEST CASES BEING CONSIDERED FIRST
public class IsStringPalindrome {

	/*
	 * Questions:
	 * - What is a palindrome? Can you please clarify / elaborate?
	 * - Is a single character a palindrome? "a"
	 * - Is empty String a palindrome? ""
	 * - Do we care about cases? Meaning, uppercase, lowercase. "abA"
	 * - Are we going to deal with single String or multiple Strings?
	 * 		Because, when dealing with multiple Strings, are we going to
	 * 		consider spaces or not? "Abb a"
	 * - What about special characters? Like period (.)? "Abb a."
	 */
	
	/*
	 * Pseudocode:
	 * - create a new String called original, and assign a String value to check
	 * - create another String that will store the reverse version called reverse
	 * - for loop backwards
	 * 		- update the reverse String by adding each character from the original String
	 * - check if the reverse String is equal to original String
	 */
	
	/*
	 * Test cases:
	 * - mom	-> true
	 * - civic	-> true
	 * - race car 	-> if space considered ->false, if space NOT considered ->true
	 * - mommy	-> false
	 * - Mom	-> if case-sensitive ->false, if NOT case-sensitive ->true
	 * - ""
	 * - null
	 */
	public static void main(String[] args) {
		System.out.println( isPalindrome( "race car" ) );
	}
	
	public static boolean isPalindrome (String input) {
		if (input == null) {
			return false;
		}
		
		String original = input.replace(" ", "").toLowerCase();
		String reverse = "";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt( i );
		}
		
		return original.equals( reverse ) ;
	}
}
