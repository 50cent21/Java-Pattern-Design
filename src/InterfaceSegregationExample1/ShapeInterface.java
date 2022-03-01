package InterfaceSegregationExample1;

public interface ShapeInterface {
	
     public double area();
}

interface SolidShapeInterface {
	
	public double volume();
}

interface ManageShapeInterface {
	
	public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface,
                      ManageShapeInterface{
	//calculate the surface area of the cuboid
	public double area() {
		return 1.0;
	}
	
	//calculate the volume of the cuboid
	public double volume() {
		return 1.0;
	}
	
	public double calculate() {
		return this.area() + this.volume();
	}
}

class Square implements ShapeInterface, ManageShapeInterface{
	
	public double area() {
		return 2.0;
	}
	public double calculate() {
	    return this.area();
	}
	
}
