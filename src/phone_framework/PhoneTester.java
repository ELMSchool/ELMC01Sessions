package phone_framework;

import phone_framework.utilities.*;

public class PhoneTester {

	public static void main(String[] args) {
//		Phone phone = new Phone();
//		phone.ring();
		
		Phone smartPhone = new SmartPhone();
		Phone homePhone = new HomePhone();
		Phone toyPhone = new ToyPhone();
		
		smartPhone.ring();
//		smartPhone.touchScreen();
		homePhone.ring();
		toyPhone.ring();
		
		Phone[] phones = new Phone[3];
		phones[0] = smartPhone;
		phones[1] = homePhone;
		phones[2] = toyPhone;
		
		
		
		
	}
	
	
}
