package session012;

import java.util.Scanner;

public class House {
	
	private int numberOfHomesSold;
	private int streetNumber = 123;
	private String streetName = "Test Street";
	boolean isForSale;
	
	// default
	// no-args
	// hidden
	public House() {
		
	}
	
	// specialized
	// overloaded
	public House(int streetNumber, String streetName, boolean isForSale) {
		// default steps where properties are INITIALIZE
		
		// the come the following steps where the properties are UPDATED
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.isForSale = isForSale;
	}
	
	public void sellHouse() {
		if (isForSale) {
			this.isForSale = false;
		} else {
			System.out.println("This house was not on sale. You can't sell it.");
		}
	}
	
	public void listHouse() {
		this.isForSale = true;
	}
	
	public void showHouseToCustomer() {
		System.out.println("Go to this address: " 
				+ this.streetNumber + " " 
				+ this.streetName);
	}
	
	public void setStreetNumber(int streetNumber) {
		if (streetNumber > 0) {
			this.streetNumber = streetNumber;
		} else {
//			this.streetNumber = 0;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Looks like you entered a wrong number.");
			System.out.println("Street numbers need to be positive values.");
			System.out.println("Please enter a valid input: ");
			
			this.streetNumber = scan.nextInt();
		}
	}
}
