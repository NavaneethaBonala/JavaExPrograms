package searching_algorithm;

public class LinearEx {
	
	public static int search(int arr[], int N, int x)
	{	// checking number at index number
		for (int i=0; i<N; i++)
		{
			if (arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main (String[] args)
	{
		int arr[] = {10,20,50,90,45};
		int x = 45;
		
		int result = search(arr, arr.length, x);
		if (result == -1)
			System.out.println("Element is not present");
		else
			System.out.println("Element is at index number "+result);
	}
	
}
