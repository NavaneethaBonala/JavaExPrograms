package factorypatternVehicle;

public class BikeFactory implements VehicleFactory{
	
	@Override
	public Vehicle createVehicle() 
	{
		// Implement logic to create and return a Bike object
		return new Bike();
	}

}
