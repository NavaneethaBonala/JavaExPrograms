package access_modifiers.privatee;

//PrivateClass.java
class  Privatee{
 private int privateField;

 private Privatee() {
     // private constructor
 }

 private void privateMethod() {
     System.out.println("Private method called");
 }

}

public class PrivateClass
{
	public static void main(String[] args) {
		//Privatee obj = new Privatee(); here constructor is private so cannot create obj
	     // Error: privateField and privateMethod are not accessible here
	     // obj .privateMethod (); // cannot access the private method in sub class
	 }
}
