package specifier;

import accessspecifier.Specifier;

public class Specifier1 extends Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Specifier1 obj3 = new Specifier1();
		obj3.promethod();
		obj3.pubmethod1();
//		obj3.privmethod(); cannot be accessed outside the package
//		obj3.defaultmethod(); cannot be accessed outside the package

	}

}
