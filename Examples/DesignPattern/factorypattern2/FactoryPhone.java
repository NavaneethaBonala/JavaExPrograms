package factorypattern2;

public class FactoryPhone {

	public static void main(String[] args) {
		
		OperatingSystem ops = new OperatingSystem();
		OS obj = ops.getinstance("Closed");
		obj.spec();
		OS obj1 = ops.getinstance("Open");
		obj1.spec();
		OS obj2 = ops.getinstance("xyz");
		obj2.spec();		
	}
}
