package examples;

public class File {

	public static void main(String[] args) {

		int a = 12010;
		int d;
		while(a>0)
		{
			d = a%100;
			if(++d/3==0)
				break;
			else
				a=a/1000;
			System.out.println(d);
		}
	}

}
