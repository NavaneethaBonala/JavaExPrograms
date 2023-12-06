package loopexamples;

public class Forloop2 
{

	public static void main(String[] args) 
	{
		// print 1st 100 Odd numbers
		for(int i=1; i<=100; i+=2) // initialise , test , execute , increment
		{
			System.out.print(i+" ,");
		}
		
		// print Even numbers 
		for(int i=1; i<=100; i++) // initialise , test , execute , increment
		{
			if(i%2==0)
			System.out.println(i);
		}
		
		//100 numbers divible by 5 an 7
		for(int i1 = 1; i1<= 1000; i1++)
		{
			if (i1%5==0 & i1%7==0)
			{
				System.out.println(i1);
			}
				
		}
		System.out.print("End of the Loop");
		}
	}
