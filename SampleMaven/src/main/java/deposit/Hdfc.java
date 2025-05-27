package deposit;

public class Hdfc implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj = new Hdfc();
		obj.recurringDeposit(10000, 5);
		
	}

	@Override
	public void recurringDeposit(double amount, float year) {
		// TODO Auto-generated method stub
		double interest = (amount*interest_rate*year)/100;
		double total_amount = amount+ interest;
		System.out.println("Amount: " +amount);
		System.out.println("Duration: " + year);
		System.out.println("Interest:" + interest);
		System.out.println("Total Amount: " +total_amount );
		
		
	}

}
