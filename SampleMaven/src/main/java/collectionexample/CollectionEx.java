package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<String>();
		
		//add elements in the collection
		li.add("red");
		li.add("blue");
		li.add("green");
		li.add("yellow");
		li.add("black");
		li.add("black");
		li.add("black");
		System.out.println("Color:" +li);
	
		
		//set elements based on  index position
	
		
		System.out.println(li.set(2, "Orange"));
		
		System.out.println(" Color:" +li);
		
		//indexOf(return index of first occurrence of specific element)
		System.out.println(li.indexOf("black"));
		
		//lastindexOf(return the last occurrence of specific element)
		System.out.println(li.lastIndexOf("black"));
		
		//get(return element at specific index)
		System.out.println(li.get(2));
		
		//contains(to check an element is present or not)
		System.out.println(li.contains("magenta"));
		System.out.println(li.contains("black"));
		
		//isEmpty(check whether your list is empty or not)
		System.out.println(li.isEmpty());
		
		//remove
		System.out.println(li.remove(1));
		System.out.println("Colors: " +li);
		
		//size
		System.out.println(li.size());
		
		//print array elements
		for(int i=0; i<6; i++) {
			System.out.println(li.get(i));
		}
		
		//for each loop
		for(String j:li) {
			System.out.println("Collection elements: " +j);
			
		}
		

	}

}
