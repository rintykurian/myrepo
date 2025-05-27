package interfaceexample;

public class InterfaceChildClass implements InterfaceEx1, InterfaceEx2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChildClass obj = new InterfaceChildClass();
		obj.print();
		obj.display();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
	    System.out.println("This is Parent1 Interface");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Parent2 Interface");
		
	}

}
