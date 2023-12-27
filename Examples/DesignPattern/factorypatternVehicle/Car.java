package factorypatternVehicle;

//Create concrete product classes (Car and Bike)

public class Car implements Vehicle
{

	@Override
	public void startEngine() {
		System.out.println("Car Engine Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car Engine Stoped");
	}
	
}
