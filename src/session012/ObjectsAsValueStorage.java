package session012;

import session006.CountdownTimer;

public class ObjectsAsValueStorage {
	
	public static void main(String[] args) {
		
		// my default House object should look like 123, Test Street, false
//		House myHouse = new House(); // int = 0; String = null; boolean = false;
		
		
		House designer = new House(2340, "Rose St", false);
		
		
		
		
		House austinHome = new House( 123, "Austin city", true );
		austinHome.showHouseToCustomer();
		
//		austinHome.streetNumber = -4;
//		austinHome.streetName = "Test Str";
		austinHome.isForSale = false;
		
		
		
		TownHouse thouse = new TownHouse();
		thouse.listHouse();
		thouse.shareHOAInfo();
		
		
		
		
		
		
		
		
		int[] houseForSale = new int[3]; // default all 3 elements to 0
		char[] characters = {'a', 'b', 'c'};
		
//		int number = "Str";
		
		
	}

	public static void intReturn() {
//		return 5;
	}
}
