package collections;
import java.util.*;

public class ArrayList_Books {

	public static void main(String[] args) {
		
		ArrayList<Book> al = new ArrayList<Book>();
		
		Book obj1 = new Book(1, "Oracle pl/sql", 450);
		Book obj2 = new Book(2, "SpringBoot - RESTAPI", 250);
		Book obj3 = new Book(3, "SpringMVC", 1450);
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		//for each loop
		for(Book b : al)
			System.out.println(b);
		
		Iterator it = al.iterator();
		//using iterator
		while(it.hasNext())
			System.out.println(it.next());
	
		}
}
