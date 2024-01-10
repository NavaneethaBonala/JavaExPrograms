package searching_algorithm;


public class BinarySearch {
	
	public static int binarysearch(int arr[], int N, int x)
	{
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right)
		{
			int mid = left + (right -left)/2;
			
			if(arr[mid]== x)
				return mid;
			else if(arr[mid]<x)
				left = mid+1;
			else
				 right = mid-1;								
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
		int arr[] = {10,15,20,25,30,32};
		int x = 32;
		
		int result = binarysearch(arr, arr.length, x);
		
		if (result == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Element foud at index number :"+result);
		
	}

}