package abstractVsInterface;

public class Guitar implements InstrumentPlayable{

	@Override
	public void playSound() {
		System.out.println("Tininiw");
	}

	@Override
	public void playStyle() {
		System.out.println("Strumming");
		
	}
	
}
//It should be interface because Guitar or Piano who would implement them would implement the inherited methods differently.
