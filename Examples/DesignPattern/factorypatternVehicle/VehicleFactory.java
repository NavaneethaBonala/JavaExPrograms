package factorypatternVehicle;

//Define the Factory interface (

public interface VehicleFactory {
	
	Vehicle createVehicle();
	/*
	 * This interface is defining a contract that any class implementing VehicleFactory 
	 * must provide an implementation for the createVehicle method, 
	 * which should return an object of type Vehicle. 
	 * Implementing classes will provide their specific logic for creating instances of Vehicle.
	 */

}
