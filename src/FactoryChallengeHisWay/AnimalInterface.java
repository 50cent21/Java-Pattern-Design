package FactoryChallengeHisWay;

interface AnimalInterface {
	
	void speak();

}
class Duck implements AnimalInterface {
	public void speak() {
		System.out.println("Duck says Pack-pack");
	}
}
class Tiger implements AnimalInterface {
	public void speak() {
		System.out.println("Tiger says Roar-roar");
	}
}
