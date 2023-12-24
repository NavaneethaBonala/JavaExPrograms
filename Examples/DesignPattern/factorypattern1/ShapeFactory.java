package factorypattern1;

public class ShapeFactory {
	
	public Shape createShape(String s)
	{
		Shape shape = null;
		if(s.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(s.equalsIgnoreCase("Square"))
			return new Square();
		else if(s.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else
			return shape;
	}	
}
