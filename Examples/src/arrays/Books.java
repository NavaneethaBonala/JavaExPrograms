package arrays;

import java.util.*;

public class Books {

	public int bookid;
	public String booktitle, bookauthor;
	public float price;
	
	public Books() {}
	
	public Books(int bookid, String booktitle, String bookauthor, float price)
	{
		
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.price = price;
	}
	
	public void addBooks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Book and Author : ");
		booktitle=sc.next();
		bookauthor=sc.next();
		
		System.out.println("Enter Book Id and Price : ");
		bookid=sc.nextInt();
		price = sc.nextFloat();
		
		sc.close();
	}
	
	public void displayBooks()
	{
		System.out.println("\n"+bookid+"\t"+booktitle+"\t"+bookauthor+"\t"+price);
	}

	public static void main(String[] args) 
	{

		Books[] book = new Books[2]; //array of objects
		
		//allocate memory of each object and read data to the objects
		for(int i=0;i<2;i++)
		{
			book[i]= new Books(); // allocate memory for object
			book[i].addBooks();
		}
		
		for(int i=0;i<2;i++)
			book[i].displayBooks();	
		
		Scanner obj = new Scanner(System.in);
		System.out.println("\nEnter book title to search ");
		String title = obj.next();
		
		int flag=0;
		
		//lenear search
		for(int i=0;i<2;i++)
		{
			if( title.compareTo(book[i].booktitle) ==0  ) {
				book[i].displayBooks();
				flag++;
			}
		}
		
		if(flag==0)
			System.out.println("Searching book not found");
		obj.close();
	}
}


