package phone_framework;

public class SmartPhone extends MobilePhone {
	public int widthPixels;
	public int lengthPixels;
	
	public void ring() {
		System.out.println("SmartPhone ringing...");
	}
	
	public void touchScreen() {
		System.out.println("Touchscreen touched...");
	}
}
