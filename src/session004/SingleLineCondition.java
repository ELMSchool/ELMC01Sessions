package session004;

public class SingleLineCondition {
	
	public static void main(String[] args) {
		int cityA = 12;
		int cityB = 11;
		
		// Ternary is a SINGLE LINE CONDITIONAL STATEMENT
		// that allows you to get the result and assign it right away
		
						// condition
		int difference = (cityB > cityA) ? 
				cityB - cityA : 	// action IF the condition is TRUE
				cityA - cityB;		// action IF the condition is FALSE
		
//		if(cityB > cityA) {
//			difference = cityB - cityA;
//		} else {
//			difference = cityA - cityB;
//		}
		
		System.out.println("The other way of finding difference: " + difference);
		
		
		System.out.println("Difference is " + difference + " hour" + ((difference > 1) ? "s." : ".") );    
	
	
	}

}
