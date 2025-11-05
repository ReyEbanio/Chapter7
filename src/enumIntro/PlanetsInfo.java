package enumIntro;

public enum PlanetsInfo {
	Mercury(5,10),
	Venus(5.5, 9),
	Earth(7,12);

	double mass;
	double width;
	
	PlanetsInfo(double mass, double width) {
		this.mass = mass;
		this.width = width;
	}
	
	public double getMass() {
		return mass;
	}
	public double getWidth() {
		return width;
	}
	
	public double gravityOfPlanet() {
		double gravity = 6.6734131341;
		return gravity * mass / ((width/2)*(width/2));
	}
	
}
