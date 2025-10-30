package interfaces;

public class Main {
	public static void main(String[] args) {
		Shape circle1 = new Circle(4.5);
		Shape rectangle1 = new Rectangle(5, 4);
		
		System.out.println("Circle area : "+circle1.area());
		System.out.println("Circle perimeter : "+circle1.perimeter());
		
		System.out.println("Rectangle area : "+rectangle1.area());
		System.out.println("Rectangle perimeter : "+rectangle1.perimeter());
		
	}
}
