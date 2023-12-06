package loopexamples;

public class Primenumber {

		public boolean isPrime(int number)
		{
			boolean flag=true;
			int i;
			
			for(i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=false;
					break;
				}
			}
				
			return(flag);
		}
		
		public static void main(String[] args) {
			
			Primenumber obj = new Primenumber();
			
			int a=9, b=11;
			
			boolean result=obj.isPrime(a); //calling the method
			System.out.println(a+ "is prime number " + result);
			
			System.out.println(b+ " is prime number "+ obj.isPrime(b)); //calling the method

		}

	}


