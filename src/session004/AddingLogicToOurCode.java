package session004;

public class AddingLogicToOurCode { 
	
	public static void main(String[] args) {
		
		// We will be given current times in 2 cities.
		// Without using Math.abs(), please find the difference
		// between these 2 cities (the time difference should ALWAYS be positive).
		// Example: cityA = 8 am, cityB = 4 am, difference is 8 - 4 = 4
		//			cityA = 3 am, cityB = 9 am, difference is 3 - 9 = -6 > SHOULD be 6 (positive)
		
		int cityA = 9;
		int cityB = 9;
		
		int difference = cityA - cityB;
		
		// if difference between two cities is negative, then multiply it by -1
		if (difference < 0) {
			difference = difference * -1;
		}
		
		
		System.out.println("Difference between 2 cities: " + difference);
		
		
		int otherWayOfFindingDifference;
		
		if(cityB > cityA) {
			otherWayOfFindingDifference = cityB - cityA;
		} else {
			otherWayOfFindingDifference = cityA - cityB;
		}
		
		System.out.println("The other way of finding difference: " + otherWayOfFindingDifference);
	}

}
