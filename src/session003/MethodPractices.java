package session003;

import java.util.Scanner;

public class MethodPractices {
	
	/* Program: Email Assistant
	 * Requirements:
	 * 		Write a program that will ask you to login to your email
	 * 	using login and password.
	 * 		Then the program will tell you how many unread emails you currently
	 * 	and it will ask you how many emails have you finished reading now.
	 * 		After you tell the program how many emails you read,
	 * 	it will print out how many emails are still left to read.
	 * 
	 * Specifications (specs):
	 * 		When you login, the program should ask for your username and password,
	 * 	and then print it to the screen saying: 
	 * 	"You've successfully logged in with this 'username' and 'password'."
	 * 
	 * 		When you check your email, the program will randomly generate a number
	 * 	of 'unread' emails (from 0 to 100).
	 * 		Then it will print and ask how many emails you are reading, 
	 * 	and will simply find the difference between emails unread and emails read
	 * 	and print out: "You still have 'number of emails' emails to read."
	 */

	public static void main(String[] args) {
		
		// call / invoke our login function
		login(); 
				
		// call / invoke our unread email generator function
		unreadEmailGenerator();
		
		
		
	}
	
	
	
	/** 
	 * This method when invoked will simply ask the user to provide
	 * username and password values and will then just simply print
	 * them out to the console, stating that the user is logged in
	 * with these credentials.
	 */
	public static void login() {
		Scanner input = new Scanner(System.in);
		
		// Designing our login functionality
		System.out.println("Welcome to Your Email!");
		
		// ask for the username and password AND store the user's response
		System.out.println("Please enter your username: ");
		String username = input.nextLine();
		
		System.out.println("Please enter your password: ");
		String password = input.nextLine();
		
		System.out.println("You've successfully logged in with this username: \"" + username + "\" and password: \"" + password + "\".");
	}
	
	
	/**
	 * This method when invoked will simply create a random number of
	 * unread emails, and then ask the user to state how many emails
	 * s/he has read. Then it will print out the difference, stating that
	 * the user still has so many emails left to read.
	 */
	public static void unreadEmailGenerator() {
		Scanner input = new Scanner(System.in);
		
		// generate a random number of unread emails and store it in a variable
		int unreadEmails = (int) (Math.random() * 100);

		// ask the user to input how many emails s/he has read
		// capture the number and store it
		System.out.println("How many emails have you read? ");
		int readEmails = input.nextInt();

		// find the difference between read and unread emails and print it out
		int remainingUnreadEmails = unreadEmails - readEmails;
		System.out.println("You still have " + remainingUnreadEmails + " emails to read.");
	}
}
