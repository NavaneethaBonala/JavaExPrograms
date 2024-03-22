package access_modifiers.publicc;

//MainClass.java
public class MainClass {
 public static void main(String[] args) {
	 // obj created
     PublicClass obj = new PublicClass();
     //calling the method from public class
     obj.publicField = 10;
     obj.publicMethod();
 }
}
