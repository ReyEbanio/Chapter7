package defaultStaticInterface;

public class Main {
	public static void main(String[] args) {
		Appliance washingMachine1 = new WashingMachine();
		washingMachine1.turnOff();
		washingMachine1.turnOn();
		Appliance.info();
	}
}
