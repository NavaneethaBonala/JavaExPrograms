package loopexamples;

public class ObjectExample {
	
private int a,b;
	
	public ObjectExample(int a , int b){
		this.a=a;
		this.b=b;
	}
	
	public ObjectExample() {} //default constructor
	
	
	public ObjectExample addition(ObjectExample obj1) {
		
		ObjectExample obj = new ObjectExample();
		obj.a=this.a + obj1.a;
		obj.b=this.b+obj1.b;
		return(obj);	
		
	}
	
	public void show()
	{
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
	}

	public static void main(String[] args) {
		
		ObjectExample x,y,z;
		x= new ObjectExample(1,3);
		y= new ObjectExample(4,5);
		z=x.addition(y);
		System.out.println("Object x");
		x.show();
		System.out.println("Object y");
		y.show();
		System.out.println("Object z");
		z.show();
		
}


}
