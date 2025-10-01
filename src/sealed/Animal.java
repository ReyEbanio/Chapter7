package sealed;

public sealed class Animal permits Animal.Amphibians, Dog, Cat{
	public final class Amphibians extends Animal{
		
	}
}

