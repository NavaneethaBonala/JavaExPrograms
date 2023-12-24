package overriding;
// overriding is applicable when method have same method name with same parameters

class Animal {
	// Basic implementation defined in base class
	public void makeSound() {
	System.out.println("Animal is making sound");
	}
}
class Dog extends Animal 
{
	@Override
	public void makeSound() { // Method with same signature(name) as super class
	System.out.println("Woof!"); // Different implementation(
	}
}
public class OverridingExample 
{
	public static void main(String[] args) 
	{
		// here we are creating object for Dog bcz Dog class extends Animal Super class
		Dog dg = new Dog ();
		// calling a makesound() method from the class
		// now we have makesound() in both the calsses  
		dg.makeSound();
		//  first, obj searches for the method in its own class, 
		//if it is available then it will prefer its own class method than the super class method
	}
}

