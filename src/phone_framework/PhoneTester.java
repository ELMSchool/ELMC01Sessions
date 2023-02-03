package phone_framework;

public class PhoneTester {

	public static void main(String[] args) {
//		Phone phone = new Phone();
//		phone.ring();
		
		HomePhone homePhone = new HomePhone();
		homePhone.ring();
		
//		MobilePhone mobilePhone = new MobilePhone();
//		mobilePhone.ring();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.ring();
	}
}
