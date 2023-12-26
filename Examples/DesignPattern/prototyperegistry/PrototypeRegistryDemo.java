package prototyperegistry;

import java.util.HashMap;
import java.util.Map;

// Prototype interface with Cloneable
class Shape implements Cloneable {
    // Common properties
    private String name;

    // Clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Getter method
    public String getName() {
        return name;
    }
    // setter method
    public void setName(String name)
    {
    	this.name = name;
    }

    // Draw method (to be overridden by concrete shapes)
    public void draw() {
        System.out.println("Drawing a " + name);
    }
}

// Concrete implementation of the prototype
class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(String name, int radius) {
        super.setName(name);;
        this.radius = radius;
    }

    // Override the clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy and then handle deep copy if necessary
        //Circle clone = (Circle) super.clone();
        // Perform deep copy if needed
        // clone.someField = new SomeField(this.someField);
        return (Circle) super.clone();
    }

    // Override the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Concrete implementation of the prototype
class Square extends Shape {
    private int side;

    // Constructor
    public Square(String name, int side) {
        super.setName(name);
        this.side = side;
    }

    // Override the clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy and then handle deep copy if necessary
        //Square clone = (Square) super.clone();
        // Perform deep copy if needed
        // clone.someField = new SomeField(this.someField);
        return (Square) super.clone();
    }

    // Override the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }
}

// Prototype registry or manager
class ShapeRegistry {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String name, Shape shapePrototype) {
        shapeMap.put(name, shapePrototype);
    }

    public Shape getShape(String name) {
        try {
            Shape shapePrototype = shapeMap.get(name);
            if (shapePrototype != null) {
                return (Shape) shapePrototype.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

// Client class to demonstrate creating objects using the registry
public class PrototypeRegistryDemo {
    public static void main(String[] args) {
        // Create a prototype registry
        ShapeRegistry shapeRegistry = new ShapeRegistry();

        // Register prototype shapes
        shapeRegistry.registerShape("Circle", new Circle("Circle", 5));
        shapeRegistry.registerShape("Square", new Square("Square", 4));

        // Demonstrate creating objects using the registry
        Shape clonedCircle = shapeRegistry.getShape("Circle");
        Shape clonedSquare = shapeRegistry.getShape("Square");

        // Output the details of the cloned shapes
        if (clonedCircle != null) {
            clonedCircle.draw();
        } else {
            System.out.println("Shape not found in registry.");
        }

        if (clonedSquare != null) {
            clonedSquare.draw();
        } else {
            System.out.println("Shape not found in registry.");
        }
    }
}
