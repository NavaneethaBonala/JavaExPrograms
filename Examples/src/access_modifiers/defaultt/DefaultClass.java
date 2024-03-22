package access_modifiers.defaultt;


//default members (package-private) are accessible within the same package.

//DefaultClass.java
class DefaultClass {
 int defaultField;

 DefaultClass() {
     // default constructor
 }

 void defaultMethod() {
     System.out.println("Default method called");
 }
}
