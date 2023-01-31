package session008;

/**
 * Our toThePower() will accept 2 integers. 
 * It will then return the output of the first number 
 * raised to the power of the other. 
 * 
 * Contingencies:
 * 1. You are NOT allowed to use any Java or other built-in methods. 
 * 2. You should be able to solve for this challenge by using loops.
 */
public class MyMath {

	public static void main(String[] args) {
		
		System.out.println( toThePower(3, 0) );
		
	}
	
	
	
	public static int toThePower(int a, int b) {
		
		// 0 (zero) is a special unique case,
		// therefore we can create an initial conditional check
		// and if user asks to return a value to the power of 0
		// we'll just retun '1', and not even bother with the rest of the method
		if (b == 0) {
			return 1;
		}
		
		// a ^ b (a to the power of b)
		// 2 ^ 3 = 2 * 2 * 2 = 8 => a * a * a (b times, which is 3)
		// 3 ^ 2 = 3 * 3     = 9 => a * a     (b times, which is 2)
		
		int poweredUpValue = 0;
		
		// create a loop that repeats 3 times
		for ( int i = 1 ; i <= b ; i++ ) {
			
			if (i == 1) {
				poweredUpValue = a * 1;
				continue;
			}
			
			poweredUpValue = poweredUpValue * a;
			
		}
		
		return poweredUpValue;
	}
	
}
