package exceptionexample;

public class ExeceptionEx {
	public void division() {//Arithmetic Exception
		int a =10;
		int b=0;
		int c = a/b;
		System.out.println("Value: " +c);
	}
	
	public void arraymethod() {//ArrayIndexOutOfBound Exception
		int d[]= {2,3,4,5};
		for(int i=0; i<=4;i++) {
			System.out.println(d[i]);
		}
	}
	public void nullmethod() {//NullPointerException
		String name = null;
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeceptionEx obj = new ExeceptionEx();
		//obj.division();
		//obj.arraymethod();
		obj.nullmethod();

	}

}
