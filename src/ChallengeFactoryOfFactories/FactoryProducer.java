package ChallengeFactoryOfFactories;

public class FactoryProducer {

	public static FactoryMovieInterface getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("COMEDY")) {
			return new ComedyMovieFactory();
		}else if(choice.equalsIgnoreCase("ACTION")) {
			return new ActionMovieFactory();
		}
		return null;
	}
}
