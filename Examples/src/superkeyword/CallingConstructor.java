package superkeyword;

class Animal1 {
    Animal1() {
        System.out.println("Animal constructor");
    }
}

class Dog1 extends Animal {
    Dog1() {
        super();  // Calling superclass constructor
        System.out.println("Dog constructor");
    }
}
public class CallingConstructor
{
	public static void main(String[] args)
	{
		//Dog1 dog = new Dog1();
		//Animal1 a = new Animal1();
			}
}