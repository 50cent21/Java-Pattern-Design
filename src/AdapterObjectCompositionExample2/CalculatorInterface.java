package AdapterObjectCompositionExample2;

public interface CalculatorInterface {
	//target interface
	public double getArea(Rectangle myRectangle);
	
}
class Calculator implements CalculatorInterface {
	
	Rectangle rectangle;
	
	public double getArea(Rectangle myRectangle ) {
		rectangle = myRectangle;
		return rectangle.length*rectangle.width;
	}
}
