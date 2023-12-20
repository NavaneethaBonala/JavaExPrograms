package lambdaExpression;

interface Test
{
	public void convertToUpperCase(String s);
}

public class UpperCase 
{
	public static void main(String args[]) 
	{
		Test test = (String s) -> {
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
		};
		test.convertToUpperCase("JAVA Programming Language");
	}
}
