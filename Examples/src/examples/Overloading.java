package examples;

public class Overloading {
	
	public void show()
	{
		System.out.println("welcome to Overloading");
		
	}
	
	public void show(String name)
	{
		System.out.println("Welcome!!! "+ name);
	}
	
	public void show(String name, int idno)
	{
		System.out.println("Welcome!!! "+ name + " And your Idno is "+ idno);
	}
	public static void main(String[] args) {
		
		
		Overloading obj = new Overloading();
		
		obj.show("krishna", 1001);
		obj.show();
		
	}
}
