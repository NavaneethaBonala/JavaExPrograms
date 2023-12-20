package lambdaExpression;

@FunctionalInterface
interface FunctionalInterfaceSingleParam {
	//An abstract method with single parameter
	public int squareTheNumber(int a);
}
public class LamdaExpresssionSingleParam 
{
	public static void main(String args[]) 
	{
		// lambda expression with single parameter num
		// The lambda function takes an argument num and
		// return the square of the number by multiplying it with itself.
		FunctionalInterfaceSingleParam f = (num) -> num*num;
		System.out.println(f.squareTheNumber(25));
	}
}
