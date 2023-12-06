package exceptionhandling;

public class MethodLevelException {
	
	//method level exception handling	
		public static void displayArray(int[] arr, int size) throws Exception
		{
			
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
			
		}

		public static void main(String[] args) 
		{
			
			int x[] = {10,203,30,40,50,60,70};
			
			try {
			MethodLevelException.displayArray(x, 8);
			}catch(Exception e)
			{
				System.out.println("pass only valid size of your array!!");
				
			}

		}

	}
