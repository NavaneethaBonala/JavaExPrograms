package lambdaExpression;

@FunctionalInterface
interface FunctionalInterfaceNoParam {
	//A method with no parameter
	public String sayHello();
}

public class LambdaExpressionNoParamExample 
{
	public static void main(String args[]) 
	{
		// lambda expression
		// In this example () means there is no parameter
		// for this lambda expression.
		// Refer to Rule Number 2 of the defining
		// lmbda explained earlier.
		FunctionalInterfaceNoParam msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}
