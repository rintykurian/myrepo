package methodoverloading;

public class MethodOverload extends MethodOverloadEx {
	public void display() {
		super.display();
		System.out.println("Good Morning");
	}
	public void sum(int a, int b) {
		super.sum(10, 40);
		int c = a+b;
		System.out.println(c);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload obj = new MethodOverload();
		obj.display();
		obj.sum(30,70);

	}
	

}
