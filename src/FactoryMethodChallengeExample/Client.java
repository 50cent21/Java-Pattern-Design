package FactoryMethodChallengeExample;

public class Client {

	public static void main(String[] args) {
		
		AnimalFactory af=new AnimalFactory();
		AnimalInterface a1=af.getAnimal("Lion");
		a1.makeASound();
		AnimalInterface a2=af.getAnimal("Cow");
		a2.makeASound();
		AnimalInterface a3=af.getAnimal("Cat");
		a3.makeASound();
	}
}
