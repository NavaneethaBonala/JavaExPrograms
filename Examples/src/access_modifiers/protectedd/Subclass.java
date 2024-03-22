package access_modifiers.protectedd;

//Subclass.java
// here we can access the protected method and consructor because it is inherited
//with out inheritance we cannot access the procted methods
public class Subclass extends ProtectedClass 
{
 public static void main(String[] args) 
 {
     Subclass obj = new Subclass();
     obj.protectedField = 20;
     obj.protectedMethod();
 }
}
