package inteface;

interface Interface1 {

	public int a=10;
	
	public void add();
}

interface Interface2 {
	
	public int b=20;  //final data
	
	public void multiply(); //method dclaration

}

class Myclass implements Interface1, Interface2
{
	public void add()
	{
		System.out.println(a+b);
	}
	public void multiply()
	{
		System.out.println(a*b);		
	}
}

