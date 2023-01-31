package session001;

public class WorkingWithVariables {
	
	public static void main(String[] args) {
		// I want to store my age in a bucket
		// What type of a bucket can I use?
		byte age = 35;
		
		// What about the current year? How can I store it?
		int currentYear = 2022; 
		
		// What about my ZIP Code? How can I store it?
		int zipCode = 77094;
		
		// calculate and find the year of birth before we print it
		short yearOfBirth = (short) (currentYear - age);
		
		// How can I store texts?
		// Let's say, I want to store a standard text saying
		// "Per our calculations, you are born in: "
		String standardMessage = "Per our calculations, you are born in: ";
				
		// Print the year I was born:
		System.out.println(standardMessage);
		System.out.println(yearOfBirth);
		
		currentYear = 2008;
		
		// There is a BUG / DEFECT in this code
		// Even though we updated the 'currentYear' to '2008'
		// when we print the 'yearOfBirth' below, 
		// it still gives '1987'. WHY???
		System.out.println(standardMessage);
		System.out.println(yearOfBirth);

	}

}
