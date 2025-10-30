package interfaceInheritance;

public class Smartphone extends Phone{
	
	@Override
	public void turnOn() {
		//Call to parent implementation
		super.turnOn();
		System.out.println("Smartphone is turning on.");
		System.out.println("Your phone is Android.");
	}
	
}
