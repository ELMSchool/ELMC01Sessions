package session005;

public class CommonErrors {
	
	public static void main(String[] args) {
		
		// create a method that would tell us 
		// if a given number is greater than or less than 0 (zero)
		
		System.out.println("Output of method call: " + isGreaterThanZero(0) );
		
		// create the same method, this time 
		// return 1 if greater, 0 if equal, -1 if less
		
		System.out.println();
	}

	/**
	 * Some smart comments. Wow!!
	 * @param number
	 * @return
	 */
	public static boolean isGreaterThanZero(int number) {
		return number > 0;
	}
	
	public static int returningAnInt(/*some parameters maybe*/) {
		int returnIntValue = -1;
		
		// develop logic that would update the value of
		// returnIntValue to a reasonable number
		// and then just returnIntValue
		returnIntValue = 100;
		
		
		return returnIntValue;
	}
	
	public static boolean returningABoolean(/* some params */) {
		
		
		
		
		return false;
	}
	
	
	public static String returningAString(/* some args */) {
		
		
		
		
		return null;
	}
}
