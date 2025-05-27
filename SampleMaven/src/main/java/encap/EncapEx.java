package encap;

public class EncapEx  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapParent obj = new EncapParent();
		obj.setName("Rinty");
		String name1 = obj.getName();
		System.out.println("Name: " + name1);
		obj.setAge(35);
		System.out.println("Age: "+ obj.getAge());

	}

}
