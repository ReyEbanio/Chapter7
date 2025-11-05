package enumIntro;

public enum Seasons{
	Winter("Cold"),
	Fall("MediuCold"),
	Summer("Hot"),
	Spring("Cool");
	
	String temperature;
	
	Seasons(String temperature) {
		this.temperature = temperature;
	}
	
	public String getTemperature() {
		return temperature;
	}
	
}
