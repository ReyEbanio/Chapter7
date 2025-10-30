package inheritingDuplicateAbstractMethod;

public class Athlete implements Walkable, Runnable{
	@Override
	public void move() {
		System.out.println("Athlete is moving fast.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(int klmPerHour) {
		// TODO Auto-generated method stub
		
	}
}
