package FactoryChallengeHisWay;

public class Client {

	public static void main(String[] args) throws Exception {
		
		AnimalFactoryInterface animalFactory=new ConcreteFactory();
		AnimalInterface duckType=animalFactory.getAnimalType("Duck");
		duckType.speak();
		
		AnimalInterface tigerType=animalFactory.getAnimalType("Tiger");
		tigerType.speak();
	}
}
