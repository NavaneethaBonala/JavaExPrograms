package inteface;

interface X
{
	void show();
	void config();
}

interface Y 
{
	void run();
}
interface Z extends Y
{
	//void read();
}

class D implements X,Z
{
	@Override
	public void show() {
		System.out.println("This is Show");
	}

	@Override
	public void config() {
		System.out.println("This is config");
	}

	@Override
	public void run() {
		System.out.println("This is run");
	}	
}

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		
		D id = new D();
		id.show();
		id.config();
		id.run();
		/*
		 * Whenever you create a reference of an interface and create an object of a class, 
		 * then you can only call those methods by that reference that are present 
		 * in that interface of which the reference is created. 
			Methods of another interface can be called by using another reference variable 
			for that interface with the object of a class.
		 */
	 	X id1 = new D();
		id1.show();
		id1.config();
		
		Y id2 = new D();
		id.run();
		 
	}
}

