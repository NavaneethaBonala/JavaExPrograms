package staticc;
// Static variable and method
class Calc{
	static int stA=100; //independent of object // we can use this by class name as well as object
	int  inB=100;  //dependent of object //we can only use this by object

	public static void main(String []args){
		Calc obj1=new Calc(); 
		Calc obj2=new Calc();
		//for static variable
		System.out.println(Calc.stA); //use with class name
		System.out.println(obj1.stA);  //use by object name

		//for instance variable
		//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
		System.out.println(obj1.inB); //used by object name reference 


		// = if we can change value static or instance what happen 
		obj1.inB=1000;
		obj1.stA=2000;

		//static 
		System.out.println(obj1.stA);//output: 2000
		System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 
		//it also show that static variable independent of objects

		//instance 
		System.out.println(obj1.inB); // output: 1000
		System.out.println(obj2.inB); // output: 100 no change in obj2
	}
}
