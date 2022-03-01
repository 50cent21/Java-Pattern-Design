package LiskovSubstitutionPrinciple;

public class Vehicle {
	
     abstract int getSpeed();
     abstract int getCubicCapacity();
}
public class Car extends Vehicle {
	
	int getSpeed() {}
	int getCubicCapacity() {}
	boolean sHatchBakck() {}
}
public class Bus extends Vehicle {
	
	int getSpeed() {}
	int getCubicCapacity() {}
	String getEmergencyExitLoc() {}
}
public static void main(String[] args) {

	Vehicle vehicle=new Bus();
	vehicle.getSpeed();
	vehicle=new Car();
	vehicle.getCubicCapacity();
}
}