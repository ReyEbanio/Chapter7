package interfaces;

public class Circle implements Shape{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double areaCircle = Math.PI * Math.pow(radius, 2);
		return areaCircle;
	}

	@Override
	public double perimeter() {
		double areaPerimeter = 2 * Math.PI * radius;
		return areaPerimeter;
	}
}
