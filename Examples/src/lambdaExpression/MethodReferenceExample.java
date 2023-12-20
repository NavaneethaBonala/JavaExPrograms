package lambdaExpression;

/**
 *
 * In this class we create a Thread without the directly
 * overriding the run() method. Rather we pass a function reference.
 *
 */
public class MethodReferenceExample {
	public static void ThreadStart(){
		System.out.println("Thread started ...");
	}
	public static void main(String[] args) {
		Thread t2=new Thread(MethodReferenceExample::ThreadStart);
		t2.start();
	}
}
