package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set is unordered 
		Set<String> s = new HashSet<String>();
		s.add("Cat");
		s.add("Dog");
		s.add("Bear");
		s.add("Cow");
		System.out.println("Animals:" +s);
		
		Set<String> j = new HashSet<String>();
		j.add("Buffallo");
		j.add("Crocodile");
		j.add("Rat");
		j.add("Mice");
		System.out.println("Animals:" +j);
		
		//addAll
		System.out.println(s.addAll(j));
		System.out.println("Animals:" +s);
		
		//contains
		
		System.out.println(s.containsAll(j));
		
		//isEmpty
		System.out.println(s.isEmpty());
	    //size
		System.out.println(s.size());
		//remove
		System.out.println(s.remove("Mice"));
		System.out.println(s);
		//clear
		s.clear();
		System.out.println(s);
		
		System.out.println(s.isEmpty());
	}
	

}
