package session011;

/*
 * You're given a String that can contain parenthesis.
 * Write a program that'll check if the parenthesis usage is correct.
 * Meaning, if you have an opening parenthesis, 
 * you should have matching closing parenthesis.
 * 
 * Ex. "Java JDK (Java Development Kit) 
 * 		contains JRE (Java Runtime Environment) and JVM (Java Virtual Machine)" -> true
 * Ex. "Java is awesome)" -> false
 */
/* Questions:
 * - What type I have to return? true or false : boolean
 * - How many methods do I have to create? : up to you
 * - What is the condition that will return true? : ()
 * - Can I have mixture of parenthesis? : (()()(()))
 * - Are ( and ) going to be the only type of parenthesis? : {()}()
 */
/* Test Cases:
 * - ()		-> true
 * - ()()() -> true
 * - )		-> false
 * - (		-> false
 * - 		-> true
 * - )(		-> false
 * - (())	-> true
 * - (()	-> false
 * - ())( 	-> false
 */
/* Pseudocode
 * 1. look into each character from the String
 * 	a. when we see (, add +1 to a counter
 * 	b. when we see ), minus -1 from a counter
 *  c. if at any time, we see -1 (meaning ')' before '(' ), we stop the loop
 * 2. after we go through all chars,
 *    if counter is 0 we'll return true
 *    otherwise return false
 */
public class ParentalControl {

	public static void main(String[] args) {
		
		String str = "{(})()";
		String pars = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			
			if (currentChar == '(') {
				pars = pars + currentChar;
			}
			if (currentChar == '{') {
				pars = pars + currentChar;
			}
			
			if (currentChar == ')') {
				if (pars.length() > 0 && pars.charAt( pars.length() - 1 ) == '(') {
					pars = pars.substring(0, pars.length() - 1);
				} else {
					System.out.println("if within loop: BAD PARENTAL CONTROL");
					return;
				}
			}
			if (currentChar == '}') {
				if (pars.length() > 0 && pars.charAt( pars.length() - 1 ) == '{') {
					pars = pars.substring(0, pars.length() - 1);
				} else {
					System.out.println("if within loop: BAD PARENTAL CONTROL");
					return;
				}
			}
		}
		
		// pars -> 
		if (pars.length() == 0) {
			System.out.println("GOOD");
		} else {
			System.out.println("final if: BAD PARENTAL CONTROL");
		}
		
	}
	
	
	
	
	
	
	public static boolean parentalControlWithCounter(String str) {
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char currentChar = str.charAt(i);
			
			if( currentChar == '(' ) {
				counter = counter + 1;
			}
			if( currentChar == ')' ) {
				counter = counter - 1;
			}
			
			if( counter < 0 ) {
				return false;
			}
		}
		
		if (counter == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
