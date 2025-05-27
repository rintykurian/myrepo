package salarycalculation;

public class TotalSalaryCalc extends HraAndPf {
	double totalsalary;
	public double getTotalSalary() {
		totalsalary = bpay+hra+pf+bonus-deduction;
		System.out.println("Total Salary : " + totalsalary);
		
		return totalsalary;
	
	}

}
