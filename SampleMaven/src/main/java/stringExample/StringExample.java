package stringExample;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s= "Hi";
			//charAt(Position of a charater)
			char c = s.charAt(1);
			System.out.println(c);
			//Length of character
			System.out.println(s.length());
			//Concat(Add two strings)
			String d = " Good morning";
			System.out.println(s.concat(d));
			//contains
			String f =" There is a pen";
			System.out.println(f.contains("There"));
			System.out.println(f.contains("how"));
			//isempty
			System.out.println(s.isEmpty());
			String g="";
			System.out.println(g.isEmpty());
			//equals
			String h ="java";
			String i ="Java";
			String j ="java";
			String k ="Selenium";
			System.out.println(h.equals(i));
			System.out.println(h.equals(j));
			System.out.println(h.equals(k));
			//equalsIgnoreCase
			System.out.println(h.equalsIgnoreCase(i));
			//toUpperCase
			System.out.println(h.toUpperCase());
			//toLowerCase
			System.out.println(i.toLowerCase());
			//valueOf
			int a= 10;
			String b = String.valueOf(a);
			System.out.println(b);
			
			String m = new String("java");
			System.out.println(h.equals(m));
			//==
			System.out.println(h==j);// compares the value
			System.out.println(h==m);// compares the reference when new Keyword is used.
			
		
	}

}
