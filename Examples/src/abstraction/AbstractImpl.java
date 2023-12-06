package abstraction;

public class AbstractImpl extends Abstrac1 {

	//implementing abstract method from base class
	public void hello()
	{
		System.out.println("abstract method overriden in subclass");
	}
	

	public static void main(String[] args) {
		
		
		AbstractImpl obj = new AbstractImpl();
		
		((Abstrac1) obj).Msg();
		obj.hello();

	}


	

}
