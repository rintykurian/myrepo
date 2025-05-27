package superclassExample;

public class SuperVariable extends SuperVariableEx{
	String color = "Red";
	public void print() {
		
		System.out.println(super.color);
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariable obj= new SuperVariable();
		obj.print();

	}

}
