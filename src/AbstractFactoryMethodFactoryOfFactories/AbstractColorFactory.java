package AbstractFactoryMethodFactoryOfFactories;

public  abstract class AbstractColorFactory {

	abstract Color getColor(String color);
}
class ColorFactory extends AbstractColorFactory {
	
	public Color getColor(String colorType) {
		if(colorType==null) {
			return null;
		}else if(colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}else if(colorType.equalsIgnoreCase("RED")) {
			return new Green();
		}
		return null;
	}
}
