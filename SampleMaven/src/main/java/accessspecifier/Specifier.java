package accessspecifier;

public class Specifier {
	public void pubmethod1() {
		System.out.println("This is a public method");
	}
	private void privmethod() {
		System.out.println("This is a private method");
	}
	void defaultmethod() {
		System.out.println("This is a default method");
	}
	protected void promethod() {
		System.out.println("This is a protected method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Specifier obj = new Specifier();
		obj.pubmethod1();
		obj.privmethod();
		obj.defaultmethod();
		obj.promethod();

	}

}
