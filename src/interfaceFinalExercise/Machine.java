package interfaceFinalExercise;

public class Machine implements Movable, Chargeable, Communicable, Swimmable{
	public void powerOn() {
		System.out.println("Machine is on.");
	}
	public void powerOff() {
		System.out.println("Machine is off.");
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		printMessage("Swimming.");
	}
	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		printMessage("communicate.");
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		printMessage("info.");
	}
	@Override
	public void charge() {
		// TODO Auto-generated method stub
		printMessage("charge.");
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		printMessage("status.");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		printMessage("move.");
	}
}
