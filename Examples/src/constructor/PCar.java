package constructor;

public class PCar {
    // Default constructor
    public PCar() {
        // Default initialization logic
        System.out.println("A new car is created with default settings.");
    }

    // Parameterized constructor with one parameter
    public PCar(String model) {
        // Initialization logic based on the provided model
        System.out.println("A new car of model " + model + " is created.");
    }

    // Parameterized constructor with two parameters
    public PCar(String model, int year) {
        // Initialization logic based on the provided model and year
        System.out.println("A new car of model " + model + " from year " + year + " is created.");
    }

    // Other methods and properties of the Car class can follow
    
    // Usage of the Car class
    public static void main(String[] args) {
        // Creating objects using different constructors
        PCar defaultCar = new PCar();// Default constructor
        PCar modelCar = new PCar("Sedan"); // Parameterized constructor with one parameter
        PCar fullCar = new PCar("SUV", 2023); // Parameterized constructor with two parameters
    }
}

