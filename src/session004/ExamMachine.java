package session004;

import java.util.Scanner;

public class ExamMachine {

	public static void main(String[] args) {
			
		examMachine();
		
	}
	
	/**
	  	We are going to develop a very simple machine that will
		display a multiple choice question
		list the possible answers
		ask the user to make a choice, and
		check whether the user has made a correct choice.
		The question and answer options are:
		
		Which of the following is NOT a conditional operator:
		a. &&
		b. |
		c. !
		d. ==
		The user is expected to enter a, b, c or d as an answer.
		
		If the user selects the correct answer, our program will print out 'Congratulations!'
		
		If the user selects a wrong answer, our program will print out 'Invalid choice.'
		
		If the user enters a selection that is not a, b, c or d, then our program will print out 'Bad choice.'
	 */
	public static void examMachine() {
		System.out.println("Which of the following is NOT a conditional operator:\n"
				+ "a. && \n"
				+ "b. |  \n"  
				+ "c. !  \n"  
				+ "d. ==");
		String correctAnswerMessage = "Congratulations!";
		String wrongAnswerMessage = "Invalid choice.";
		String invalidInput = "Bad choice.";
		
		Scanner input = new Scanner(System.in);
		char userAnswer = input.nextLine().charAt(0);
		
		if (userAnswer == 'a' || userAnswer == 'b' || userAnswer == 'c') {
			System.out.println(wrongAnswerMessage);
		} else if (userAnswer == 'd') {
			System.out.println(correctAnswerMessage);
		} else {
			System.out.println(invalidInput);
		}
		
		String printMessage = 
				(userAnswer == 'a' || userAnswer == 'b' || userAnswer == 'c') ?
						wrongAnswerMessage 
						: ( (userAnswer == 'd') ?
								correctAnswerMessage
								: invalidInput )
				;
		System.out.println("Ternary result: " + printMessage);
	}
}
