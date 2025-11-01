package interfaceFinalExercise;

public class SmartDrone extends Machine implements Flyable, Swimmable{
	
	@Override 
	public void move() {
		Flyable.super.move();
	}
	
	@Override
	public void swim() {
		System.out.println("I can swim.");
	}

	@Override
	public void fly() {
		System.out.println("I can fly.");
	}
	
}
