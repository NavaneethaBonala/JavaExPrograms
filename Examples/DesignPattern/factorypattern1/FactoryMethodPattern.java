package factorypattern1;

public class FactoryMethodPattern {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();
		
		Shape s = sf.createShape("Circle");
		s.drawshape();
		
		Shape s1 = sf.createShape("Square");
		s1.drawshape();
		
		Shape s2 = sf.createShape("Triangle");
		s2.drawshape();
	}

}
