package session008;

import java.util.Scanner;

/**
 * You have 3 lives to win the game. If your lives end, the program will print
 * "Game Over!". Before the GameOver, the program will ask you if you won. If
 * you enter 'Y' - the program will congratulate you, saying "You Won!". But, if
 * you enter 'N' 3 times, the game will be over.
 */
public class GameOver {

	public static void main(String[] args) {
		gameOver();
	}

	public static void gameOver() {
		// max lives = 3
		// if lives == 0, print "Game Over!"
		// ask if user won:
		// if 'Y' -> print "You Won!"
		// if 'N' -> continue and reduce the lives by 1

		int maxLives = 3;
		Scanner scannerInput = new Scanner(System.in);

		do {
			
			System.out.println("Did you win?");
			char userResponse = scannerInput.nextLine().charAt(0);

			if (userResponse == 'Y') {
				System.out.println("You won!");
				break;
			} else {
				maxLives = maxLives - 1;
			}

			// as long as my lives are NOT 0, I will continue
		} while ( maxLives != 0 );

		if ( maxLives == 0 ) {
			System.out.println("Game Over!");
		}
		
	}
}
