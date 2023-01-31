package session001;

public class CharExperiment {
	
	public static void main(String[] args) {
		// when we are storing char in our memory,
		// we are actually NOT STORING the character that we see
		// but we are storing the number of VARIATION that that character
		// stands for in the ASCII table
		char questionMark = '?';   
		char firstLetter = 21 + 5;
		
		char whyIsThisHappening = (char)(firstLetter + questionMark);
		

		System.out.println(whyIsThisHappening);
		
		double balance = 4.90;
		int balanceInCents = (int)(balance * 100);
		System.out.println(balance * 100);
	}

}
