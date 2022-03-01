package BuilderPatternExample;

public class Director {
	
	BuilderInterface myBuilder;
	
	public void construct(BuilderInterface builder) {
		myBuilder=builder;
		myBuilder.buildBody();
		myBuilder.insertWheels();
		myBuilder.addHeadLights();
	}

}
