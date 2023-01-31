package session004;

public class SwitchWithoutBreaks {
	
	public static void main(String[] args) {
		
		// We want to see if we are on a working day in the week
		// or on the weekend.
		// If the current day is Mon, Tue, Wed, Thur or Fri, we are on a WEEKDAY
		// otherwise the current day can be either Sat or Sun,
		//  which means we are on the WEEKEND
		// Use switch statement to design your code
		// NOTE: User can enter any value, not necessarily the real days of week
		// Example: user can say Happyday - you should say not weekend nor weekday
		
		String currentDay = "Saturday";
		String typeOfDay = "";
		
		switch (currentDay) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday": typeOfDay = "WEEKDAY"; break;
			
			case "Saturday": 
			case "Sunday": typeOfDay = "WEEKEND"; break;
			
			default: typeOfDay = "Not a weekend nor weekday"; break;
		}
		
		System.out.println("Type of day: " + typeOfDay);
	}

}
