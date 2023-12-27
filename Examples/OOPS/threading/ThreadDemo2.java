package threading;


class Hie extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
					
		}
	}
}

class Hellow extends Thread
{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Hie obj1 = new Hie();
		Hellow obj2 = new Hellow();
		
		obj1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}	
		obj2.start();
		
		
	}

}
