package superclassExample;

public class ConstructorProgram extends ConstructorEx {
	public ConstructorProgram() {
		super(20,20);
		System.out.println("Hello");
		
	}
	public ConstructorProgram(int c) {
		//super();
		System.out.println("Print C= " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////ConstructorProgram obj= new ConstructorProgram();
		//ConstructorEx obj2= new ConstructorEx(10,20);
		ConstructorProgram obj1= new ConstructorProgram(30);

	}

}
