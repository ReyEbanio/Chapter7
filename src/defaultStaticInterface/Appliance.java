package defaultStaticInterface;

public interface Appliance {
	void turnOn();
	
	default void turnOff() {
		info();
		System.out.println("Turned off.");
	}
	
	public static void info() {
		System.out.println("Appliance is in good condition.");
	}
	
}
