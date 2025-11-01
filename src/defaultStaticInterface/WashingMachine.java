package defaultStaticInterface;

public class WashingMachine implements Appliance{

	@Override
	public void turnOn() {
		System.out.println("Washing machine is washing clothes.");
	}

//	@Override
//	public void turnOff() {
//		System.out.println("Washing machine turned off.");
//	}
	
}
