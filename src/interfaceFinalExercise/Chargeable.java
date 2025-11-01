package interfaceFinalExercise;

public interface Chargeable {
	
	void charge();
	void status();
	
	private static void checkStatus(String chargingStatus) {
		if(chargingStatus.equals("Full")) {
			System.out.println("Battery is full.");
		}
	}
	
	default void batteryCharging(String message) {
		checkStatus(message);
	}
	
	static void getBatteryPercentage() {
		System.out.println("I don't know.");
	}
	
}
