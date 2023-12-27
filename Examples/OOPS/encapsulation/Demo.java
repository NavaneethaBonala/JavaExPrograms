package encapsulation;// package
//class
class Demo1
{	// private data members
	private int age;
	private String name;
	 // getter and setter methods
	 public int getage()
	 {
		 return age;
	 }
	 public void setage(int a)
	 {
		 age = a;
	 }
	 
	 public void setname(String n)
	 {
		 name = n;
	 }
	 
	 public String getname()
	 {
		 return name;
	 }
}
// class
public class Demo {
	//main 
	public static void main(String[] args) {
		// obj creation for demo1 class
		Demo1 obj = new Demo1();
		// setting name and age values using the obj calling
		obj.setname("Nita");
		obj.setage(20);
		// getting name and age values using the obj calling
		System.out.println(obj.getname()+":"+obj.getage());

	}

}
