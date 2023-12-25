package singletonpattern1;

class Abc{
	// static instance
	public static Abc obj = new Abc();
	// private constructor
	private Abc() {}
	// public static getinstance method
	public static Abc getinstance() {
		return obj;
	}
	// concrete method
	public void name() {
		System.out.println("Concrete Method");
	}
}


public class Abcd {

	public static void main(String[] args) {

		Abc obj1 = Abc.getinstance();
		obj1.name();
	}

}
