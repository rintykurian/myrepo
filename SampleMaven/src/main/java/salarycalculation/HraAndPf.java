package salarycalculation;

public class HraAndPf extends BasicPay {
	double hra;
	double pf;

	public void getHra() {
		hra = 0.05* bpay;
		System.out.println("HRA = " + hra);
	}
	public void getPf() {
		pf = 0.20* bpay;
		System.out.println("PF = " + pf);
		
	}
		
	}
		
