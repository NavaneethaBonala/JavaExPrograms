package prototype;
import java.util.*;
// class implements cloneable interface
public class Bookshop implements Cloneable
{	// data member
	private String shopname;
	// create Book ArrayList
	 List<Book> books = new ArrayList();
	 
	// getter and setter methods for data members
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	 
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	// concrete method to load Books data in to the ArrayList 
	public void loaddata()
	{
		for(int i=1; i<=10 ; i++)
		{
			Book b = new Book();
			b.setbid(i);
			b.setbname("Book "+i);
			getBooks().add(b);
		}
	}
	 // 'To string' method to display with return type	
	public String toString() {
		return "Bookshop [Shopname=" + shopname + ", books=" + books + "]";
	}
	
	// clone method 
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
