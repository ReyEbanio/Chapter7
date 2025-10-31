package implicitModifiers;

interface CarSpecs {
	
	//implicitly public, static and final
	int MAX_SPEED = 180;
	//explicitly implementing
	public static final int MIN_SPEED = 1;
	
	
	void start();
	void stop();
	
}
