package factorypatternVehicle;

//: Client code to use the factory to create vehicles

public class FactoryPatternExample {

	public static void main(String[] args) {
		// User input determines the type of vehicle to create
		String vehicleType = "Car"; // or "Bike"
		// Create the appropriate factory based on user input
		VehicleFactory factory;
		if ("Car".equalsIgnoreCase(vehicleType)) {
			factory = new CarFactory();
		} else if ("Bike".equalsIgnoreCase(vehicleType)) {
			factory = new BikeFactory();
		} else {
			throw new IllegalArgumentException("Invalid vehicle type.");
		}
		// Use the factory to create the vehicle
		Vehicle vehicle = factory.createVehicle();
		// Perform operations on the vehicle
		vehicle.startEngine();
		vehicle.stopEngine();

	}

}
