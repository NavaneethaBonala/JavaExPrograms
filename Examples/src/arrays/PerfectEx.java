package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class PerfectEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] array = new int[50];
		int i,n;
		System.out.println("Enter number of elements : ");
		n= sc.nextInt();
		
		System.out.println("Enter "+n+" numbers");
		for (i=0; i<n;i++)
			array[i] = sc.nextInt();
		
		for (i=0; i<n; i++)
		{
			int sum=0;
			for(int j=1;j<array[i]; j++)
			{
				if(array[i]%j==0)
					sum+=+j;
			}
		
		if (sum==array[i])
			System.out.println(array[i]+" is a Perfect Number ");
		

		}
	}

}
