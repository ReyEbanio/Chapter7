package interfaceInheritanceRemix;

public class Main {
	public static void main(String[] args) {
		
		SmartPlayer smartplayer1 = new SmartPlayer();
		Playable play = new SmartPlayer();
		Recordable record = new SmartPlayer();
		smartplayer1.powerOn();
		play.play();
		record.record();
		
	}
}
