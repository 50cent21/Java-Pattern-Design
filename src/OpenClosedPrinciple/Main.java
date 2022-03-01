package OpenClosedPrinciple;

public interface Shape{
	  public double CalculateArea() {
		  
	  }
}

class Rectangle implements Shape {
	public double length;
	public double width;
	
	public double calculateArea() {
		return length * width;
	}
}
class Circle implements Shape {
	public double radius;
	
	public double calculateArea() {
		return (22/7) * radius * radius;
	}	
}

class AreaCalculator {
	
	public double CalculateShapeArea(Shape shape) {
		return shape.calculateArea();
	}
}
