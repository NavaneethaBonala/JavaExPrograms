package abstraction;
// Abstract class
abstract class Car{
	// abstract method
	public abstract void drive();
	
	public Car()
	{
		
	}
	// concrete method
	public void playMusic()
	{
		System.out.println("Music is Playing");
	}
}
//****************************************************************
//concrete class extends Abstract class
class WagonR extends Car
{	// concrete class must contain all the abstract methods from the extended abstract class
	public void drive()
	{
		System.out.println("Driving");
	}	
}
//*******************************************************************
public class abstractDemo {
	public static void main(String[] args) {
		// WagonR obj is created 
		Car obj = new WagonR();

		// we can create reference with abstract class
		// but we cannot create object with abstract class
		 obj.drive();
		 obj.playMusic();
	}
}
