package FactoryChallengeHisWay;

public abstract class AnimalFactoryInterface {
	
	public abstract AnimalInterface getAnimalType(String type) throws Exception;

}
class ConcreteFactory extends AnimalFactoryInterface {
	
	public AnimalInterface getAnimalType(String type) throws Exception {
		
		switch(type) {
			case "Duck":
				return new Duck();
			case "Tiger":
				return new Tiger();
		    default:
		    	throw new Exception("Animal type: " + type + " is not a valid input");
			}
	}
}
