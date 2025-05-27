package exceptionexample;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a= 12;
		int b= 0;
		int c = a/b;
		System.out.println("Division:" +c);
		}
		catch(ArithmeticException obj){// can use Exception as ExceptionClass Name instead
			System.out.println("Exception Handled");
			
		}
		catch(ArrayIndexOutOfBoundsException obj1) {
			System.out.println("Handled Exception");
		}
		finally {
			System.out.println("Exit Code");
		}

	}

}
