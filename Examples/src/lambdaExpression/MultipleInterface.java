package lambdaExpression;
// Functinal Interface 1
interface Functional1
{
	int getcount();
}
//Functinal Interface 2
interface Functional2
{
	void msg();
}
// Class DEclaration
public class MultipleInterface {
	// Static Method Declaration
	public static int count()
	{
		int count=5;
		return ++count;
	}
	// Main method
	public static void main(String[] args) {
		// Method Reference
		Functional1 f1 = MultipleInterface :: count;
		//Lambda Expression
		Functional2 f2 = () -> System.out.println("Welcome to Java");
		
		System.out.println(f1.getcount());
		f2.msg();
	}

}
