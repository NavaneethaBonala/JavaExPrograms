package set;
import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		
		l.add("Nita");
		l.add(30);
		l.add(null);
		l.add("Neetu");
		System.out.println(l);
		l.set(0,"Software");// set : replace
		System.out.println(l);
		l.add(0, "Venky");
		System.out.println(l);
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
	}

}
