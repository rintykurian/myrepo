package collectionexample;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Mango");
		al.add("Mango");
		System.out.println("Fruits: " +al);
		ArrayList<String> bl= new ArrayList<String>();
		bl.add("Brinjal");
		bl.add("Chilly");
		bl.add("Cucumber");
		bl.add("Bittergourd");
		System.out.println("Vegetables:" +bl);
		
		//addAll- to combine two lists
		
		System.out.println(al.addAll(bl));
		System.out.println(al);
		
		//containsAll- to check if one list is present in another list
		System.out.println(al.containsAll(bl));

		//iterator
		Iterator<String> itr = al.iterator();
		
		//hasNext
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		//remove
		itr.remove();
		System.out.println(al);
		
		//
	}

}
