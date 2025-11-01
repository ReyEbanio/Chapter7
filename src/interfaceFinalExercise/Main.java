package interfaceFinalExercise;

public class Main {
	public static void main(String[] args) {
		SmartDrone smt1 = new SmartDrone();
		smt1.move();
		Chargeable.getBatteryPercentage();
		smt1.fly();
		smt1.powerOn();
		
		Swimmable smtF1 = new SmartFish();
		smtF1.swim();
	}
}
