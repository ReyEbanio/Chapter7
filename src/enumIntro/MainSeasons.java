package enumIntro;

public class MainSeasons {
	public static void main(String[] args) {
		for(Seasons season : Seasons.values()) {
			System.out.print(season+" = ");
			System.out.println(season.getTemperature());
		}
	}
}
