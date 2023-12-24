package overriding;
// super class
class A 
{
	public void show()
	{
		System.out.println("In A");
	}
}// subclass
class B extends A
{	
	@Override
	public void show()
	{
		super.show();
		System.out.println("In B");
	}
}
// Main class declaration
public class OverridingDemo
{
	public static void main(String[] args)
	{
		B obj = new B();
		//  first, obj searches for the method in its own class, 
		//if it is available then it will prefer its own class method than the super class method
		obj.show();
		//subclass method OVER RIDE the Super class method
	}
}