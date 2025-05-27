package superclassExample;

public class SuperMethod extends SuperMethodEx{
	public void show() {
		this.print(); // using this keyword instead of calling it in main method
		super.display();
		//super.sum(10, 20);
		System.out.println("This is a sample program");
	}
	public void print() {
		super.sum(10, 20);
		System.out.println(" This is an example program");
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SuperMethod obj = new SuperMethod();
		obj.show();
		//obj.display();
		//obj.print();

	}

}
