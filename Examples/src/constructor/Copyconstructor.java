package constructor;
// class
public class Copyconstructor {
	
	int a;
	int b;
	int c;
	// constructor
	public Copyconstructor() {
		System.out.println("Default constructor");
	}
	// with parameters
	public Copyconstructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Sum "+(a+b));
	}
	// copy 
	public Copyconstructor(Copyconstructor obj) {
		this.a = obj.a;
		this.b = obj.b;
		System.out.println("Copy constructor");
	}
	
	// Main
	public static void main(String[] args) {
		
		Copyconstructor cc = new Copyconstructor();
		Copyconstructor cc1 = new Copyconstructor(2,5);
		Copyconstructor cc2 = new Copyconstructor(cc);		
	}
}
