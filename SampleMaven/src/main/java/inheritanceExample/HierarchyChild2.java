package inheritanceExample;

public class HierarchyChild2 extends HierarchyParent {
	public void print() {
		System.out.println("This is child class 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchyChild2 obj1 = new HierarchyChild2();
		obj1.print();
		obj1.show();

	}

}
