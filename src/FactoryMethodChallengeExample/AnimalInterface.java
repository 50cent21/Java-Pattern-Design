package FactoryMethodChallengeExample;

interface AnimalInterface {
	
	public void makeASound();

}
class Lion implements AnimalInterface {
	
	public void makeASound() {
		System.out.println("Roar");
	}
}
class Cow implements AnimalInterface {
	
	public void makeASound() {
		System.out.println("Moo");
	}
}
class Cat implements AnimalInterface {
	
	public void makeASound() {
		System.out.println("Meow");
	}
}