package superkeyword;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();  // Calling superclass method
        System.out.println("Dog is eating");
    }
}

public class Demo
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.eat();	}
}