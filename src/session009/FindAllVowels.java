package session009;

import java.util.Arrays;

/**
 * Given a sentence, find and return all vowels and how many times they're used. 
 * Ex. "I'm buying an apple and a banana." returns "I1 u1 i1 a7 e1"
 * 
 * Vowels in English are "aeiou"
 */
public class FindAllVowels {

	// arguments
	// parameters
	public static void main(String[] args) {

		String sentence = "I'm buying an apple and a banana.";
		char[] vowels = "aeiouAEIOU".toCharArray();
		int[] repetitions = new int[ vowels.length ];

		String returnVowels = "";

		// the interviewer now wants you to NOT only find vowels
		// BUT also find HOW MANY of each is used
		for (int i = 0; i < sentence.length(); i++) {

			char sentenceChar = sentence.charAt( i );
			
			for (int v = 0; v < vowels.length; v++) {
				
				char vowelsChar = vowels[ v ];
				
				if ( sentenceChar == vowelsChar ) {
					returnVowels = returnVowels + vowelsChar;
					repetitions[ v ] = repetitions[ v ] + 1;
					break;
				}
				
			}
			
		}
		
		
		System.out.println("Vowels: " + returnVowels);
		System.out.println( Arrays.toString( vowels ) );
		System.out.println( Arrays.toString( repetitions ) );
		
		
		
	}
	
	
	public static void findingWithInnerLoop() {
		String sentence = "I'm buying an apple.";
		
		char[] vowels = "aeiouAEIOU".toCharArray(); // {'a', 'e', 'i'....}
		
		// String fruit = new String("apple");
		// String fruit = "apple";
		// char[] fruit = {'a', 'p', 'p', 'l', 'e'};

		String returnVowels = "";

		// consider using char comparison from 'sentence' and 'vowels' Strings
		// and inner loop to compare each char from one with the other
		for (int i = 0; i < sentence.length(); i++) {

			char sentenceChar = sentence.charAt( i );
			
			for (int v = 0; v < vowels.length; v++) {
				
				char vowelsChar = vowels[ v ];
				
				if ( sentenceChar == vowelsChar ) {
					returnVowels = returnVowels + sentenceChar;
					break;
				}
				
			}
			
		}
		
		
		System.out.println("Vowels: " + returnVowels);
		
	}
	
	public static void findingWithContainsMethod() {
		String sentence = "I'm buying an apple.";
		String vowels = "aeiouAEIOU";

		String returnVowels = "";

		
		for (int i = 0; i < sentence.length(); i++) {

			String currChar = sentence.substring(i, i + 1);
			
			
			if ( vowels.contains( currChar ) ) {
				
				returnVowels = returnVowels + currChar;
				
			}
			
			
		}
		
		
		System.out.println("Vowels: " + returnVowels);
	}
	

	public static void findingWithSingleCharSubstring() {
		String sentence = "I'm buying an apple.";

		String returnVowels = "";

		for (int i = 0; i < sentence.length(); i++) {

			String currChar = sentence.substring(i, i + 1);

			if (currChar.equalsIgnoreCase("a") 
					|| currChar.equalsIgnoreCase("e") 
					|| currChar.equalsIgnoreCase("i")
					|| currChar.equalsIgnoreCase("o") 
					|| currChar.equalsIgnoreCase("u")) {

				returnVowels = returnVowels + currChar;
			}

		}

		System.out.println("Vowels: " + returnVowels);
	}

}
