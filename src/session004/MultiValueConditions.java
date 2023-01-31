package session004;

public class MultiValueConditions {
	
	public static void main(String[] args) {
		
		// We will be given month as a number from 1 to 12,
		// we need to print the full calendar name of the month.
		// Example: 1 -> January, 9 -> September
		
		int monthNumber = 13;
		String calendarName;
		
//		if (monthNumber == 1) {
//			calendarName = "January";
//		}else if (monthNumber == 2) {
//			calendarName = "February";
//		}else if (monthNumber == 3) {
//			calendarName = "March";
//		}else if (monthNumber == 4) {
//			calendarName = "April";
//		}else if (monthNumber == 5) {
//			calendarName = "May";
//		}else if (monthNumber == 6) {
//			calendarName = "June";
//		}else if (monthNumber == 7) {
//			calendarName = "July";
//		}else if (monthNumber == 8) {
//			calendarName = "August";
//		}else if (monthNumber == 9) {
//			calendarName = "September";
//		}else if (monthNumber == 10) {
//			calendarName = "October";
//		}else if (monthNumber == 11) {
//			calendarName = "November";
//		}else if (monthNumber == 12) {
//			calendarName = "December";
//		}else {
//			calendarName = "Wrong month number";
//		}
		
		// Used in cases where we are checking for the 
		// equality condition of a value to certain number of values
		// Java allows us to use SWITCH block / statement
		// which makes it easier to read and handle
		switch (monthNumber) {
			case 1: calendarName = "January"; break;
			case 2: calendarName = "February"; break;
			case 3: calendarName = "March"; break;
			case 4: calendarName = "April"; break;
			case 5: calendarName = "May"; break;
			case 6: calendarName = "June"; break;
			case 7: calendarName = "July"; break;
			case 8: calendarName = "August"; break;
			case 9: calendarName = "September"; break;
			case 10: calendarName = "October"; break;
			case 11: calendarName = "November"; break;
			case 12: calendarName = "December"; break;
			default: calendarName = "Wrong number"; break;
		}
		
		// IMPORTANT THINGS TO REMEMBER ABOUT switch statement:
		// - it ONLY checks for equality condition (no comparisons)
		// - DEFAULT block is acting as ELSE block
		// - add BREAK after each block (unless you don't want to intentionally)
		
		System.out.println("Calendar name is: " + calendarName);
	}

}
