package overriding;

class Animal {
	// Basic implementation defined in base class
	public void makeSound() {
	System.out.println("Animal is making sound");
	}
}
class Dog extends Animal 
{
	@Override
	public void makeSound() { // Method with same signature
	System.out.println("Woof!"); // Different implementation
	}
}
public class OverridingExample 
{
	public static void main(String[] args) 
	{
		Dog dg = new Dog ();
		dg.makeSound();
	}
}

