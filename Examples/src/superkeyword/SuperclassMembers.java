package superkeyword;

class Animal2 {
    String sound = "Animal Sound";

    void makeSound() {
        System.out.println(sound);
    }
}

class Dog2 extends Animal2 {
    String sound = "Bark";

    void dogSound() {
        System.out.println(sound);  // Accessing subclass sound
        System.out.println(super.sound);  // Accessing superclass sound
    }

    void makeSound() {
        super.makeSound();  // Calling superclass method
    }
}
public class SuperclassMembers
{
	public static void main(String[] args)
	{
		Dog2 dog = new Dog2();
		dog.makeSound();
		//Animal1 a = new Animal1();
			}
}