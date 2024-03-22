package access_modifiers.defaultt;

//AnotherClass.java (in the same package)
public class AnotherClass {
 public static void main(String[] args) {
     DefaultClass obj = new DefaultClass();
     obj.defaultField = 30;
     obj.defaultMethod();
 }
}
