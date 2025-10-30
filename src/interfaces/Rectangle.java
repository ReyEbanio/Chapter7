package interfaces;

public class Rectangle implements Shape{

	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		double rectangleArea = length * width;
		return rectangleArea;
	}

	@Override
	public double perimeter() {
		double rectanglePerimeter = (2 * length) + (2 * width);
		return rectanglePerimeter;
	}
	
}
