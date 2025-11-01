package interfaceFinalExercise;

public interface Flyable {
	void fly();
	default void move() {
		System.out.println("Moving by Flying.");
	}
}
