package prototype;
// class declaration
public class Demo {
	// main method throws CloneNotSupportedException
	public static void main(String[] args) throws CloneNotSupportedException {
		// Object created for Bookshop class
		Bookshop bs = new Bookshop();
		// in bookshop we have 'shop name' and 'arraylist of books'
		// assign names using the objects
		bs.setShopname("Cosmetics");
		bs.loaddata();
		System.out.println(bs);
		
		// create another object using cloneable
		//(Bookshop) bs.clone(); --> here clone is used for bookshop class 
		Bookshop bs1 = (Bookshop) bs.clone();
		bs1.setShopname("Cookies");
		System.out.println(bs1);
		
	
	}

}
