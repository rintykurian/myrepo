package amountwithdrawal;

public class User {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
	Bank obj = new Bank();
	obj.setPin(1234);
	System.out.println("Entered Pin:" + obj.getPin());
	obj.ValidatePin();
	
	}
}
