package enumIntro;

public class PlanetInfoMain {
	public static void main(String[] args) {
		for(PlanetsInfo planetInfo : PlanetsInfo.values()) {
			
			System.out.println(planetInfo);
			System.out.println("Its mass is "+planetInfo.getMass());
			System.out.println("Its width is "+planetInfo.getWidth());
			System.out.println("Its Gravity is "+planetInfo.gravityOfPlanet());
			
			System.out.printf("%s has a mass of %.2f kg and a radius of %.0f and a gravity of %.2f", 
					planetInfo, planetInfo.getMass(), planetInfo.getWidth(),planetInfo.gravityOfPlanet());
			System.out.println("\n===============================================================");
		}
	}
	
}
