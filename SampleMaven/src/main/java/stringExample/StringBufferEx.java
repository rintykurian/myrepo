package stringExample;

public class StringBufferEx {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringBuffer s= new StringBuffer("Hi");
				System.out.println(s);
				StringBuilder a = new StringBuilder("Hello");
				System.out.println(a);
				//insert
				System.out.println(a.insert(3,"bbb"));
				//append
				System.out.println(a.append("Good Morning"));
				//replace
				System.out.println(a.replace(0, 2, "Hiiii"));
				//delete
				System.out.println(a.delete(5, 11));
				//System.out.println(s.delete(0, 1));
			}

		
	

}
