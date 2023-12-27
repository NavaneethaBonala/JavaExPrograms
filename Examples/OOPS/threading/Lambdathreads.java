package threading;

public class Lambdathreads {

	public static void main(String[] args) {
		// lambda exp for anonymous class
		Runnable obj1 = () -> 
			{	for(int i=1; i<=5; i++)
				{
					System.out.println("Hi");
					try{Thread.sleep(400);	}
					catch(Exception e) {}
				}
			};
			// lambda exp for anonymous class
			Runnable obj2 = () -> 
			{	for(int i=1; i<=5; i++)
				{
					System.out.println("Hello");
					try{Thread.sleep(500);	}
					catch(Exception e) {}	
				}
			};
			// creating threads for objects
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			// starting the threads
			t1.start();
			t2.start();
			
	}

	

}
