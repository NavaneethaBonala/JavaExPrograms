package inheritance;

//Superclass
class Animal {
	// Properties
	String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Method
	public void eat() {
		System.out.println(name + " is eating.");
	}
}

//Subclass inheriting from Animal
class Dog extends Animal {
	// Additional property
	String breed;

	// Constructor for Dog
	public Dog(String name, String breed) {
		// Call the superclass constructor using super()
		super(name);
		this.breed = breed;
	}

	// Additional method specific to Dog
	public void bark() {
		System.out.println(name + " is barking.");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		// Creating an instance of the subclass (Dog)
		Dog myDog = new Dog("Buddy", "Golden Retriever");

		// Accessing properties and methods from the superclass (Animal)
		System.out.println("Name: " + myDog.name);
		myDog.eat();
		

		// Accessing properties and methods specific to the subclass (Dog)
		System.out.println("Breed: " + myDog.breed);
		myDog.bark();
	}
}
