package ChallengeFactoryOfFactories;

interface Bollywood {
	String getMovieName();

}
class BollywoodActionMovie implements Bollywood {
	
	public String getMovieName() {
		return "Bang Bang is a Bollywood Action Movie";
	}
}
class BollywoodComedyMovie implements Bollywood {
	
	public String getMovieName() {
		return "Munna Bhai MBBS is a Bollywood Comedy Movie";
	}
}
