package salarycalculationofemp;

public class Contractor extends Employee {
	int workinghours=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj = new Contractor();
		obj.calculateSalary(100);
		FulltimeEmployee obj2= new FulltimeEmployee();
		obj2.calculateSalary(500);

	}

	@Override
	public double calculateSalary(double payperhour) {
		// TODO Auto-generated method stub
		salary = workinghours*payperhour;
		System.out.println("Contractor Employee Salary: " + salary);
		return salary;
	}

}
