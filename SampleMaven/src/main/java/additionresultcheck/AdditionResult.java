package additionresultcheck;

public class AdditionResult extends AdditionOfNumbers{
	public void resultCheck() {
		super.add(20,80);
		if(c%10==0) {
			System.out.println(+c + " is divisible by 10.");
		}
		else {
			System.out.println(+c +" is not  divisible by 10.");
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AdditionResult obj = new AdditionResult();
		obj.resultCheck();
	}

}
