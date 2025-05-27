package exceptionexample;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age = 15;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			//throw new ArithmeticException("Not Eligible");
			throw new Exception("Not Eligible");// throws keyword should be used
		}

	}

}
