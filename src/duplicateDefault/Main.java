package duplicateDefault;

public class Main {
	public static void main(String[] args) {
		Flyable duck1 = new Duck();
		duck1.move();
		Flyable.getInfo();
		Swimmable.getInfo();
		Flyable.checkFlight();
		
	}
}

