package abstraction;


public class Myclass implements Interface1, Interface2
{
	public void add()
	{
		System.out.println(a+b);
	}
	public void multiply()
	{
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		
		Myclass obj = new Myclass();
		obj.add();
		obj.multiply();

	}

}
