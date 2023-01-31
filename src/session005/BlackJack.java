package session005;

import java.util.Scanner;

/** Black Jack program
 * Rules are as such:
 * 1. You'll be given 2 random cards which will be 
 *  1.a numbers from 6 to 10 (both inclusive)
 *  1.b picture cards (Jack, Queen, King, Ace)
 * 2. You'll then find the total of these 2 cards
 *  2.a Display the total for the user.
 * 3. You'll then be asked if you want a 3rd card
 * 	3.a if YES, then you'll get 1 more random card
 * 	3.b if NO, then you'll not get another card
 * 4. You'll find the total of ALL the cards you have
 * 5. If you have 21, you win; if you have more than 21, you lose
 *   and if you have less than 21 then you're on hold.
 */
public class BlackJack {

	
	public static void main(String[] args) {
		// 1. Finding 2 random cards
		String randomCardOne = randomCardGenerator();
		String randomCardTwo = randomCardGenerator();
		
		// 2. Adding both cards
		int cardOne = cardValueFinder( randomCardOne );
		int cardTwo = cardValueFinder( randomCardTwo );
		int totalOfTwoCards = cardOne + cardTwo;
		System.out.println("Your total for 2 cards is: " + totalOfTwoCards);
		
		// 3. Ask for 3rd card 
		int cardThree = thirdCardGenerator();
		
		// 4. Update the total accordingly
		int totalOfAllCards = totalOfTwoCards + cardThree;
		System.out.println("Total value of ALL cards: " + totalOfAllCards);		
		
		// 5. Tell the user whether s/he has won or lost
		String message = "";
		if (totalOfAllCards == 21) {
			message = "You WON!";
		} else if (totalOfAllCards > 21) {
			message = "You lost!";
		} else {
			message = "You're on hold.";
		}
		
		System.out.println("My final message is: " + message);
	}
	
	/**
	 * This method will internally use Scanner class to
	 * ask the user if s/he wants to pick 3rd card.
	 * If the answer is Y, it'll generate a random card, 
	 * find its numeric value and return it.
	 * If the answer is N, it'll return 0.
	 * @return
	 */
	public static int thirdCardGenerator() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like a 3rd card? Y/N ");
		
		char userAnswer = userInput.nextLine().charAt(0);
		
		int cardThree = 0;
		
		if (userAnswer == 'Y') {
		// will convert value (// will give me a random card)
			cardThree = cardValueFinder( randomCardGenerator() );
		} 
		
		return cardThree;
	}
	
	
	/**
	 * Given a card as a String which will be one of
	 * 6, 7, 8, 9, 10, J, Q, K, A
	 * this method will return its numeric value.
	 * Example: if we give "J", we'll get 10;
	 * 	if we give "A", we'll get 11;
	 *  if we give any card from 6 to 10, we'll get its int value.
	 *  
	 * @param card
	 * @return
	 */
	public static int cardValueFinder(String card){
		int cardValue = 0;
		
		switch (card) {
			case "6": cardValue = 6; break;
			case "7": cardValue = 7; break;
			case "8": cardValue = 8; break;
			case "9": cardValue = 9; break;
			case "10": 
			case "J": 
			case "Q": 
			case "K": cardValue = 10; break;
			case "A": cardValue = 11; break;
		}

		return cardValue;
	}
	
	
	/**
	 * When called, this method will generate a random card
	 * from among 6, 7, 8, 9, 10, J, Q, K, A.
	 */
	public static String randomCardGenerator() {		
		// 1, 2, 3, 4, 5,  6, 7, 8, 9 options
		// 6, 7, 8, 9, 10, J, Q, K, A
		int randomOption = (int) (Math.random() * 9) + 1;
		
		String randomCard = "";
		
		switch( randomOption ) {
			case 1: 
				randomCard = "6"; 
				System.out.println("6"); 
				break;
			case 2: 
				randomCard = "7";
				System.out.println("7"); 
				break;
			case 3: 
				randomCard = "8";
				System.out.println("8"); 
				break;
			case 4: 
				randomCard = "9";
				System.out.println("9"); 
				break;
			case 5: 
				randomCard = "10";
				System.out.println("10"); 
				break;
			case 6: 
				randomCard = "J";
				System.out.println("J"); 
				break;
			case 7: 
				randomCard = "Q";
				System.out.println("Q"); 
				break;
			case 8: 
				randomCard = "K";
				System.out.println("K"); 
				break;
			case 9: 
				randomCard = "A";
				System.out.println("A"); 
				break;
		}
		
		return randomCard;
	}

	
}
