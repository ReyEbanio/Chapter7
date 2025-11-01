package interfaceFinalExercise;

public class SmartFish implements Swimmable, Communicable{

	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		System.out.println("Fish swimming.");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Information overload");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Swimming.");
	}
	
}
