package inheritanceExample;

public class HeirarchyChild1 extends HierarchyParent{
	public void display() {
		System.out.println("This is child class 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchyChild1 obj = new HeirarchyChild1();
		obj.display();
		obj.show();
	}

}
