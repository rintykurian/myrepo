package salarycalculation;

import java.util.Scanner;

public class BasicPay {
	double bpay;
	double deduction;
	double bonus;
	// TODO Auto-generated method stub
	public void getValues() {
	       Scanner sc= new Scanner(System.in);
	       System.out.println("Enter Basic Pay:");
	       bpay=sc.nextDouble();
	       System.out.println("Enter Deduction:");
	       deduction=sc.nextDouble();
	       System.out.println("Enter Bonus:");
	       bonus=sc.nextDouble();
		

	}
}

