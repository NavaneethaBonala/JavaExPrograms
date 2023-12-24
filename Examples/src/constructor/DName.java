package constructor;
class DName {
  private String name;

  // constructor
  DName() {
    System.out.println("Constructor Called:");
    //name = "JAVA";
  }

  public static void main(String[] args) {

    // constructor is invoked while creating an object of the Main class
	  DName obj = new DName();
   // System.out.println("The name is " + obj.name);
  }
}