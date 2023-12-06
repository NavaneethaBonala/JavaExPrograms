package arrays;

public class Array2D {

	public static void main(String[] args) {
		
	float [] a= {10,20,30,40,50,56,34,67,34}; // one Dimention array initialization
		
		int[][] b = {{1,2,4,9}
					,{2,3,4,9,9}}; // 2 rows , 3 columns 2D
		
		System.out.println("1D array with for loop");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		//for each loop: To iterate all the elements in a arrays/collection
		System.out.println("1D array with for each loop");
		for (float element : a) 
		System.out.println(element);
		
		System.out.println("2D array with for loop");
		
		for(int i=0;i<b.length;i++) //rows:2
		{
			for(int j=0;j<b[i].length;j++) //columns:3
				System.out.print(b[i][j]+" ");
			System.out.println();
		}

	} 

}
