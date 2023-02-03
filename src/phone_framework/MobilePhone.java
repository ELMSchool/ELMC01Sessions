package phone_framework;

abstract class MobilePhone extends Phone implements Carryable {
	public Provider provider;
	public String IME_ID;

	abstract void ring();
	
	abstract void touchScreen();
	
	public void carryAround() {
		System.out.println("Carrying around MobilePhone...");
	}
}
