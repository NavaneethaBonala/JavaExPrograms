package threading;

class Hi 
{
	public void show()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hi");
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
					
		}
	}
}

class Hello 
{
	public void show()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.show();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		obj2.show();
	}

}
