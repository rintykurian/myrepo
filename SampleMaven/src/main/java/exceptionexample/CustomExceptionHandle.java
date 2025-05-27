package exceptionexample;

public class CustomExceptionHandle {

	public static void main(String[] args) throws EliglibilityException {
		// TODO Auto-generated method stub
		int age = 15;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new EliglibilityException("Not Eligible");
		}

	}

}
