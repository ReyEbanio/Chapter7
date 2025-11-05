package enumIntro;

public enum SeasonsAdvance {
	
	WINTER("Nalamin"){
		@Override
		public void seasonInformation() {
			System.out.println("Ag Ice sika.");
		}
	},
	FALL("MediuNalamin"){
		@Override
		public void seasonInformation() {
			System.out.println("Agtinag bulbulong.");
		}
	},
	SUMMER("Nagpudot"){
		@Override
		public void seasonInformation() {
			System.out.println("Makset kitong mo.");
		}
	},
	SPRING("Pinagsasabung"){
		@Override
		public void seasonInformation() {
			System.out.println("Makset kitong mo.");
		}
	};
	
	private final String temperature;
	
	SeasonsAdvance(String temperature){
		this.temperature = temperature;
	}
	
	public String getTemperature() {
		return temperature;
	}
	
	public abstract void seasonInformation();
	
}
