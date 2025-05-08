package inheritanceExample;

public class SingleChild extends SingleParent {
	public void print() {
		System.out.println("Good Morning");
	}

	public static void main(String[] args) {
		SingleChild obj= new SingleChild();
		obj.print();
		obj.display();
		SingleParent obj1=  new SingleParent();
		obj1.display();
		
		// TODO Auto-generated method stub

	}

}
