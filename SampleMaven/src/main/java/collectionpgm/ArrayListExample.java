package collectionpgm;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Maroon");
		colors.add("Yellow");
		colors.add("Purple");
		
		//Print the elements in a collection
		
		System.out.println("Colors: " +colors);
		
		
		// To search an element in an array list
		String findcolor ="Yellow";
		System.out.println("Is " +findcolor+ " color in the list?");
		if(colors.contains(findcolor)) { 
			System.out.println("Element  found ");
		}
		else {
			System.out.println("Element not found ");
		}
		
	}
}
