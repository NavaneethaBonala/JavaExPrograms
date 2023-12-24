package factorypattern1;

public class ShapeFactory {
	
	public Shape createShape(String s)
	{
		Shape shape = null;
		if(s.equalsIgnoreCase("Circle"))
			shape = (Shape) new Circle();
		else if(s.equalsIgnoreCase("Square"))
			shape = (Shape)new Square();
		else if(s.equalsIgnoreCase("Triangle"))
			shape = (Shape)new Triangle();
		
		return shape;
	}

}
