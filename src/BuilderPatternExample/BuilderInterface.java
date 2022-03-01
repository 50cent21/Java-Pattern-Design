package BuilderPatternExample;

interface BuilderInterface {

     void buildBody();
     void insertWheels();
     void addHeadLights();
     Product getVehicle();
     
}
class Car implements BuilderInterface {
	
	private Product product = new Product();
	
	public void buildBody() {
		product.add("This is a body of a car");
	}
	public void insertWheels() {
		product.add("4 wheels are added");
	}
	public void addHeadLights() {
		product.add("2 headlights are added");
	}
	public Product getVehicle() {
		return product;
	}
}
class MotorCycle implements BuilderInterface {
	
	private Product product = new Product();
	
	public void buildBody() {
		product.add("This is a body of a car");
	}
	public void insertWheels() {
		product.add("2 wheels are added");
	}
	public void addHeadLights() {
		product.add("1 headlight is added");
	}
    public Product getVehicle() {
    	return product;
    }
	
}
