package arrays;

public class TwoInteger {

	public static void main(String[] args) {
		int i,j;
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,6,4,5,8};
		
		for (i=0; i <a.length;i++)
		{
			for (j=0;j<b.length; j++)
			{
				if (a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}		
	
	}
}
