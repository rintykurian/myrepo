package salarycalculationofemp;

public class FulltimeEmployee extends Employee{

	@Override
	public double calculateSalary(double payperhour) {
		// TODO Auto-generated method stub
		salary = payperhour*8;
		System.out.println("Full Time Employee Salary:" +salary );
		return salary;
	}

}
