package collections;
import java.util.*;

public class Arrlist {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(1);
		
		System.out.println("Array List : "+ al);
		System.out.println("ArrayList Using for Loop : ");
		
		for (int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("ArrayList Using While loop : ");
		int i=0;
		while(al.size()>i)
		{
			System.out.println(al.get(i));
			i++;
		}
		
		System.out.println("ArrayList Using for each loop :");
		for (int e: al)
		{
			System.out.println(e);
		}
		
		System.out.println("ArrayList Using Iterator : ");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
