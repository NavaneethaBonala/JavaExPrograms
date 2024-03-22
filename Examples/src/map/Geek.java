package map;

//Java program to demonstrate the occurrence of
//NoSuchElementException

//import required packages
import java.io.*;
import java.lang.*;
import java.util.*;

//driver class
class Geek {

	// main method
	public static void main(String[] args)
	{
		// creating an hashmap object
		HashMap<Integer, Integer> map = new HashMap<>();

		// creating an iterator
		Iterator itr = map.keySet().iterator();

		// trying to access the element
		itr.next();
	}
}
