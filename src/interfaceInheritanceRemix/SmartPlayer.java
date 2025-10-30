package interfaceInheritanceRemix;

public class SmartPlayer extends MediaDevice implements Playable, Recordable{

	@Override
	public void record() {
		System.out.println("SmartPlayer is Recording.");
	}

	@Override
	public void play() {
		System.out.println("SmartPlayer is Playing.");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Smart me is Powering on.");
	}
	
}
