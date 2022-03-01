package BuilderPatternChallenge;

public class Client {

	public static void main(String[] args) {
		System.out.println("***Meal Pattern Demo***\n");
		
		Director director = new Director();
		MealBuilderInterface vegMealBuilder=new VegMealBuilder();
		MealBuilderInterface nonVegMealBuilder =new nonVegMealBuilder();
		
		
		//making a veg meal
		director.construct(vegMealBuilder);
		Meal vegMeal= vegMealBuilder.getMeal();
		
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		//making a non veg meal
		director.construct(nonVegMealBuilder);
		Meal nonVegMeal= nonVegMealBuilder.getMeal();
		
		System.out.println("NonVeg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		
		
	}
}
