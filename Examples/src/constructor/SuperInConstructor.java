package constructor;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent {
	Child() {
		//The super keyword is mainly used in the context of
		//method overriding, constructors, accessing overridden methods, and fields.

		super(); // Invokes parent constructor
		System.out.println("Child constructor");
	}
}
public class SuperInConstructor {
	public static void main(String[] args) {
		Child child = new Child();
	}
}

