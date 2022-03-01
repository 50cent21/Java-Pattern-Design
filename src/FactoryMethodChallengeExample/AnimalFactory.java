package FactoryMethodChallengeExample;

public class AnimalFactory {

	public AnimalInterface getAnimal(String animalName) {
		if(animalName==null)
			return null;
		else if(animalName.equalsIgnoreCase("Lion"))
			return new Lion();
		else if(animalName.equalsIgnoreCase("Cow"))
			return new Cow();
		else if(animalName.equalsIgnoreCase("Cat"))
			return new Cat();
		else
			return null;
	}
}
