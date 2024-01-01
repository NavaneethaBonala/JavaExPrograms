package facadepattern;

//Subsystem Class 1
class Engine {
	public void start() {
		System.out.println("Engine started");
	}
}

//Subsystem Class 2
class FuelInjector {
	public void injectFuel() {
		System.out.println("Fuel injected");
	}
}

//Subsystem Class 3
class Ignition {
	public void ignite() {
		System.out.println("Ignition started");
	}
}

//Facade Class
class CarFacade {
	private Engine engine;
	private FuelInjector fuelInjector;
	private Ignition ignition;

	public CarFacade() {
		engine = new Engine();
		fuelInjector = new FuelInjector();
		ignition = new Ignition();
	}

	public void startCar() {
		engine.start();
		fuelInjector.injectFuel();
		ignition.ignite();
		System.out.println("Car is started and ready to go.");
	}
}

//Client Code
public class Main {
	public static void main(String[] args) {
		CarFacade car = new CarFacade();
		car.startCar();
	}
}