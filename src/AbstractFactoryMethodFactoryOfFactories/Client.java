package AbstractFactoryMethodFactoryOfFactories;

public class Client {

	public static void main(String[] args) {
		
		//get shape factory
		AbstractShapeFactory shapeFactory=
				FactoryProducer.getShapeFactory();
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("Square");
		shape2.draw();
		Shape shape3=shapeFactory.getShape("Rectangle");
		shape3.draw();
		
		AbstractColorFactory colorFactory=
				FactoryProducer.getColorFactory();
		Color color1=colorFactory.getColor("Red");
		color1.fill();
		Color color2=colorFactory.getColor("Blue");
		color2.fill();
		Color color3=colorFactory.getColor("Green");
		color3.fill();
		

	}

}
