package duplicateDefault;

public class Duck extends Animal implements Flyable, Swimmable{
	@Override
	public void move() {
		Flyable.super.move();
	}
}
