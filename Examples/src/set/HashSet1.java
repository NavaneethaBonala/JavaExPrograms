package set; // User defined Package Declaration

import java.util.*;// in built Package Declaration

public class HashSet1 {// Class Declaration

	public static void main(String[] args) {
		// Main Method
		
		//Ceating the HashSet with Integer type
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// Adding the element in to the HashSet by add() method
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		
		// Display the HashSet after Adding the Elements
		System.out.println(hs);
		
		//contains() Usage
		System.out.println("Collection contains 10 : "+hs.contains(10));
		
		//Remove an element
		hs.remove(15);
		System.out.println(hs);
		
		//display the size of HashSet
		System.out.println("Size of HashSet : "+hs.size());				
	}

}
