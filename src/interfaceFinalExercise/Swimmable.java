package interfaceFinalExercise;

public interface Swimmable {
	
	void swim();
	
	default void move() {
		System.out.println("Moving by Swimming.");
	}
	
}
