package examples;
public class Concur6 {

	public static void main(String ar[]) throws InterruptedException {

		System.out.println("The main() method");

		DaemonThreadDemo thrd = new DaemonThreadDemo();

		thrd.start();

		thrd.join();

		System.out.println(thrd.isAlive());

	}

}

class DaemonThreadDemo extends Thread {

	public DaemonThreadDemo() {

		setDaemon(true);

	}

	public void run() {

		System.out.println("The run() method");

	}

}