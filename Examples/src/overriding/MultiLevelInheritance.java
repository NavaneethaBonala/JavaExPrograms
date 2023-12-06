package overriding;

class Animal1 
{
	void eat() 
	{
		System.out.println("Animal is eating.");
	}
}
class Mammal extends Animal1 
{
	void run() {
		System.out.println("Mammal is running.");
	}
}
class Dog1 extends Mammal
{
	void bark() 
	{
		System.out.println("Dog is barking.");
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] args) 
	{
		Dog1 myDog = new Dog1();
		myDog.eat(); // Inherited from Animal
		myDog.run(); // Inherited from Mammal
		myDog.bark(); // Dog's own method
	}
}
