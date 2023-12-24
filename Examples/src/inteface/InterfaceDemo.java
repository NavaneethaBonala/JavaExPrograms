package inteface;
interface A
{
	void show();
	void config();
}

interface B extends A
{
	void run();
}
class C implements B
{
	@Override
	public void show() {
		System.out.println("This is Show");
	}

	@Override
	public void config() {
		System.out.println("This is config");
	}

	@Override
	public void run() {
		System.out.println("This is run");
	}
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		C id = new C();
		id.show();
		id.config();
		id.run();
	}
}
