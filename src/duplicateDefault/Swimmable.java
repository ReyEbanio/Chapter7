package duplicateDefault;

public interface Swimmable {
	default void move() {
		System.out.println("Moving by swimming.");
	}
	
	public static void getInfo() {
		System.out.println("This implements Swimming.");
	}
}

