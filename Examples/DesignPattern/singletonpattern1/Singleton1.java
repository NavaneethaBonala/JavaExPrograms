package singletonpattern1;

//singleton class
public class Singleton1 {
	
	private static Singleton1 si = new Singleton1();
	
	private Singleton1()
	{
		System.out.println("Object Instance..");
	}
	
	public static Singleton1 getinstance()
	{
		
		return si;
	}
	
	public void mybusinesslogic()
	{
		System.out.println("singleton method...");
		
	}
}

