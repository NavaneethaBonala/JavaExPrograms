package factorypatternVehicle;

//4.Create concrete factory classes (CarFactory and BikeFactory)

public class CarFactory implements VehicleFactory
{
	@Override
	public Vehicle createVehicle() 
	{
		// Implement logic to create and return a Car object
		return new Car();
	}

}
