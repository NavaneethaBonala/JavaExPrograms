package constructor;

class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    public Car() {
        // Implicitly calls super(), invoking the constructor of the superclass (Vehicle)
        System.out.println("Car constructor");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}

