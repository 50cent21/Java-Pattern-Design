package BuilderPatternChallenge;
 
interface Item {
	
	public String name();
	public Packing packing();
	public float price();

}
interface Packing {
	public String pack();
}
class Wrapper implements Packing {
	public String pack() {
		return "Wrapper";
	}
}
class Bottle implements Packing {
	public String pack() {
		return "Bottle";
	}
}

abstract class Burger implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}
	
	public abstract float price();
}
class VegBurger extends Burger {
	public float price() {
		return 3.50f;
	}
	public String name() {
		return "Veg Burger";
	}
}
class ChickenBurger extends Burger {
	public float price() {
		return 4.50f;
	}
	public String name() {
		return "Chicken Burger";
	}
}
abstract class ColdDrink implements Item {
	
	public Packing packing() {
		return new Bottle();
	}
	public abstract float price();
}
class Coke extends ColdDrink {
	public float price() {
		return 1.50f;
	}
	public String name() {
		return "Coke";
	}
}
class Pepsi extends ColdDrink {
	public float price() {
		return 1.75f;
	}
	public String name() {
		return "Pepsi";
	}
}
 

