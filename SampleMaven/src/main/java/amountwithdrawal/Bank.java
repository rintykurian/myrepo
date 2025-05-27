package amountwithdrawal; 

public class Bank {
	private int pin;
	private int validPins[] = {1001,1234,1212};
	

	public void setPin(int pin) {
		this.pin= pin;
		
	}
	public int getPin() {
		return this.pin;
		
	}
	public void ValidatePin() {
		boolean flag= false;
		for(int validPin : validPins) {
			if(pin==validPin) {
				flag=true;
				break;
			}	
				
		}		
		if(flag==true) {	
			System.out.println("Withdraw amount");
			
		}		
			
		else {
			System.out.println("Access Denied");	
		}
		
			
		
	}
	
	
}
