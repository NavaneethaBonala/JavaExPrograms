package constructor;
// class declaration
public class ConstOverloding {
	
	// data members
	String name;
	int age;
	
	// default constructor
	public ConstOverloding() {
		System.out.println(" Default constructor ");
	}
	
	// constructor with arguments
	public ConstOverloding(String name) {
		this.name= name;
		System.out.println("constructor with arguments");
		
	}
	// constructor with parameters
	public ConstOverloding(String name, int age) {
		this.name= name;
		this.age=age;
		System.out.println("constructor with parameters");
	}
	
	// Copy constructor 
	public ConstOverloding(ConstOverloding obj) {
		// calling data members with obj reference in copy constructor
		this.name = obj.name;
		this.age = obj.age;
	}
	
	// method
	void display() {
		System.out.println("Name =" + name + ", age=" + age ); 
	}

	
	public static void main(String[] args) {
		
		ConstOverloding c1 = new ConstOverloding("ABC");
		
		ConstOverloding c2 = new ConstOverloding("XYZ",20);
		ConstOverloding c3 = new ConstOverloding(c2);
		
		c1.display();
		c2.display();
		c3.display();
		
	}
}
