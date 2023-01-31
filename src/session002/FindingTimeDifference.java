package session002;

public class FindingTimeDifference {
	
	public static void main(String[] args) {
		
		int totalHoursInADay = 24;
		
		// I'm thinking that if I put everything in terms of minutes, 
		// it'll help me with calculations, as I can go back and forth from minutes to hours easily.
		// total minutes in a day = 24 hours * 60 minutes of each hour
		int totalMinutesInADay = totalHoursInADay * 60; // 1440 minutes
		
		// Current time is 19:42.
		// There are 4 hours and 18 minutes 
		// or 258 minutes 
		// or 15480 seconds left until the end of the day.
		
		int currentHour = 00;
		int currentMinute = 00;
		
		// ROUTE 1: Find how many minutes the current time is in total.
		//		After we find that, we can deduct that from the total minutes in any day
		//		which will give me how many minutes are left in a day.
		//		So, if I'm at 20:00 -> means I have already gone through 1200 minutes of the day,
		//		thus I have only 240 minutes left, which when then I'll divide, will give me 4 hours left.
		int currentHoursConvertedToMinutes = currentHour * 60; // 19 * 60 = 1140
		
		// to find how many minutes passed in total until now, I take hours (in minutes) and add minutes
		//											1140                      + 42 = 1182
		int totalMinutesPassedPerCurrentTime = currentHoursConvertedToMinutes + currentMinute;
		
		// now I need to find how many minutes are remaining
		// to do that I'll take the total possible minutes in a day and minus total minutes passed
		//		258 minutes 		=	1440		    - 1182
		int remainingTimeInMinutes = totalMinutesInADay - totalMinutesPassedPerCurrentTime;
		
		// if asked how many seconds are remaining, just multiply the remaining minutes by 60
		int remainingTimeInSeconds = 258 * 60;
		
		
		// What if I'm asked to give the remaining amount in hours and minutes
		// in such format: 4:18 (4 is the number of hours followed by : followed by 18 minutes)
		// 20:00 -> 4:00 >>> 24:00 -> 0:0 >>> 0:00 -> 24:00
		
		// to find remaining number of hours, if I divide the remaining minutes by 60,
		// it will give me only the complete hours, because when you divide 2 int values in Java
		// you get the int value of how many times the code was able to successfully complete the division
		//      4          = 258                    / 60
		int remainingHours = remainingTimeInMinutes / 60; // we will get the whole hours
		// it is important at this moment to not forget that when we find remainingHourse
		// we also consider that the minutes we allocated to these hours should be reduced from our total balance
		// that's why, after the allocation above, our
		// current remaining minute balance is equal to its previous balance minus the minutes we gave to remainingHours
		remainingTimeInMinutes = remainingTimeInMinutes - (remainingHours * 60);
		
		// after I allocated the remaining minutes in hours to remainingHours
		// now I can say that the reamining balance in minutes is my remaining minutes
		int remainingMinutes = remainingTimeInMinutes;
		
		System.out.println(remainingHours + ":" + remainingMinutes);
	}

}
