
package duplicateDefault;

public interface Flyable {
	default void move() {
		flyMessage("Moving by Flying.");
		
	}
	
	public static void getInfo() {
		flyMessage("This implements flying.");
	}
	
	private static void flyMessage(String message) {
		System.out.println(message);
	}
	
	static void checkFlight() {
		flyMessage("Yes I am flying, Why?");
	}
	
}
