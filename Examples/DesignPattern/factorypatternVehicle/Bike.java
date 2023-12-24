package factorypatternVehicle;

//Create concrete product classes (Car and Bike)

public class Bike implements Vehicle{
	@Override
	public void startEngine()
	{
		System.out.println("Bike Engine has Started");
	}
	@Override
	public void stopEngine()
	{
		System.out.println("Bike Engine has Stoped");
	}
}
