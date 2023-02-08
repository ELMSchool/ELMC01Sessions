package phone_framework;

import phone_framework.utilities.Phone;

public abstract class MobilePhone extends Phone implements Carryable {
	public Provider provider;
	public String IME_ID;

	public abstract void ring();
	
	public abstract void touchScreen();
	
	public void carryAround() {
		System.out.println("Carrying around MobilePhone...");
	}
}
