
package abstraction;

public class AbsClass2 extends AbstractClassEx {
	
	public int mul(int d, int f) {
		int prod = d*f;
		return prod;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		AbsClass2 obj = new AbsClass2();
		obj.display();
		System.out.println("Sum:" + obj.sum(10, 20));
		obj.display1();
		System.out.println("Product:" +obj.mul(2,30));
		
		//reference created for abstract class
		AbstractClassEx obj1 = new AbsClass2();
		obj1.display();
		obj1.display1();
		obj1.sum(10,20);
		//obj1.mul(); Since we are using parent class obj, we cannot access child class method.

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an example of abstract method");
		
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		int c = a+b;
		return c;
		
	}

}
