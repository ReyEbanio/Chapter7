package implicitModifiers;

public class SportsCar implements CarSpecs{
	
	int sportsCarSpeed;
	
	public SportsCar(int sportsCarSpeed) {
		this.sportsCarSpeed = sportsCarSpeed;
	}
	
	@Override
	public void start() {
		String carStatus = "";
		carStatus =  sportsCarSpeed > CarSpecs.MIN_SPEED ? "Car is running" : "Car is not running.";
		System.out.println(carStatus);
	}

	@Override
	public void stop() {
		System.out.println("Your car stop running.");
	}
	
	
	
}
