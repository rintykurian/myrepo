package interfaceexample;

public class InterfaceClass implements InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj = new InterfaceClass();
		obj.sum();
		obj.display();
		print();
		
		//reference
		InterfaceEx obj1 =new InterfaceClass();
		obj1.display();
		obj1.sum();
		//obj1.print(); doesn't work, because childclass property cannot be accessed

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int c= a+b;
		System.out.println("Sum: " +c);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an example of Interface Program.");
		
	}
	public static void print() {
		System.out.println("Hello");
	}

}
