package enumExercise;

public enum PowerMode {
	OFF("System is off", 0), 
	SLEEP("Low Power", 10), 
	ON("Normal Power", 50), 
	TURBO("Boost power", 100);
	
	private final String powerStatus;
	private final int powerConsumption;
	
	PowerMode(String powerStatus, int powerConsumption){
		this.powerStatus = powerStatus;
		this.powerConsumption = powerConsumption;
	}

	public String getPowerStatus() {
		return powerStatus;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}
	
	public static void showInfo() {
		for(PowerMode powerModes: PowerMode.values()) {
			System.out.println("Mode :"+powerModes+" - Power Usage = "+powerModes.powerConsumption+" - Description: "+powerModes.powerStatus);
		}
	}
	
}
