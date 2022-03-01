package AbstractFactoryMethodFactoryOfFactories;

public class FactoryProducer {

	public static AbstractShapeFactory getShapeFactory() {
		 
		return new ShapeFactory();
	}
    public static AbstractColorFactory getColorFactory() {
		
    	return new ColorFactory();
	}
}
