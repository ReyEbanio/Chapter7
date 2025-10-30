package interfaceExtend;

public class Tesla implements ElectricVehicle{

	@Override
	public void chargeBattery() {
		System.out.println("The car is Electric.");
	}

	@Override
	public void start() {
		System.out.println("The car is starting.");
		
	}

}
