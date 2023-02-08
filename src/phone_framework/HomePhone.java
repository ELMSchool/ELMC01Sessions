package phone_framework;

import phone_framework.utilities.Phone;

public class HomePhone extends Phone implements Carryable {
	public boolean isWired;
	
	public HomePhone() {
		super();
	}

	public void ring() {
		System.out.println("HomePhone ringing...");
	}
	
	public void carryAround() {
		if ( !isWired ) {
			System.out.println("Carrying around HomePhone...");
		}
	}
}
