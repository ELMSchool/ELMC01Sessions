package session002;

public class FIndingRemainingTimeToSeconds {
	
	public static void main(String[] args) {
		/* TASK
		 * Given current time as    19:10:45
		 * Return remaining time as 04:49:15
		 * 
		 * Let's create some test cases:
		 * When given  24:00:00
		 * I'll return 00:00:00
		 * 
		 * When given  00:00:00
		 * I'll return 24:00:00
		 * 
		 * When given  12:59:59
		 * I'll return 11:00:01
		 */
		
		// PSEUDOCODE -> step-by-step explanation of what needs to be done in simple English
		// Step 0: Define my variables to store current time
		int hour = 12;
		int minute = 59;
		int second = 59;
		
		// Step 1: Convert total time in a day to the smallest unit (in this case, seconds)
		int totalSecondsInADay = 24 * 3600;
		System.out.println("Total seconds in a day: " + totalSecondsInADay);
		

		// Step 2: Find out how many seconds in total have passed
		// we can find total seconds passed by multiplying total hours by 3600 (each hour has 3600 seconds)
				// and adding total minutes multiplied by 60 (each minute is 60 seconds)
				// and finally adding the seconds (each second is 1 seconds)
		// in this case,  	        19             10              45
		int totalSecondsPassed = (hour * 3600) + (minute * 60) + second;
		System.out.println("Total seconds passed: " + totalSecondsPassed);
		
		
		// Step 3: Deduct total seconds passed from total amount of seconds in a day
		// 		This will give me remaining seconds.
		int remainingSeconds = totalSecondsInADay - totalSecondsPassed;
		System.out.println("Total seconds remaining: " + remainingSeconds);
		
		// Step 4: Convert the remaining seconds into the output format (meaning HH:MM:SS)
		// Step 4a: declare variables that will hold my remaining hours, minutes and seconds
		int remainingHours;
		int remainingMinutes;
		
		// Step 4b: start dividing remaining seconds into 3600 to find how many whole hours I have left
		remainingHours = remainingSeconds / 3600;
		System.out.println("Remaining hours: " + remainingHours);
		
		
		// after we filled in 4 hour baskets with 3600 seconds each, 
		// it means we allocated those many seconds away from the remaining seconds
		// that's why the new remaining seconds is now equal to, 
		// the original balance of the remaining seconds MINUS 4 baskets of 3600 each
		// remainingSeconds = remainingSeconds - (remainingHours * 3600);
		remainingSeconds = remainingSeconds % 3600; // modulus is also know as REMAINDER
		System.out.println("Remaining seconds after we found remaining hours: " + remainingSeconds);
		
		// Step 4c: divide remaining seconds into 60 to find how many whole minutes I have left
		remainingMinutes = remainingSeconds / 60;
		System.out.println("Remaining minutes: " + remainingMinutes);
		
		// Step 4d: the remaining balance of my time in seconds would just be remaining seconds
		// in this step we should AGAIN update how many seconds are remaining AFTER we allocated them for minutes
		remainingSeconds = remainingSeconds % 60;
		
		// Step 5: Print out in hour:minute:second format (aka HH:MM:SS)
		// to help my users understand what was given and what we got to, I'll also print the original time
		System.out.println("Original time in HH:MM:SS format : " + hour + ":" + minute + ":" + second);
		System.out.println("Remaining time in HH:MM:SS format: " + remainingHours + ':' + remainingMinutes + ':' + remainingSeconds);
	}

}
