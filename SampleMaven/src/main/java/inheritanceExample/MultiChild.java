package inheritanceExample;

public class MultiChild extends MultiInter {
	public void print2() {
		System.out.println("Good Morning");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.print1();
		obj.print();
		obj.print2();

	}

}
