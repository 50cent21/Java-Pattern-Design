package ChallengeFactoryOfFactories;

interface FactoryMovieInterface {
	
	Hollywood getHollywoodMovie(); 
	
	Bollywood getBollywoodMovie();

}
class ActionMovieFactory implements FactoryMovieInterface {
	
	public Hollywood getHollywoodMovie() {
		return new HollywoodActionMovie();
	}
	public Bollywood getBollywoodMovie() {
		return new BollywoodActionMovie();
	}
}
class ComedyMovieFactory implements FactoryMovieInterface {
	
	public Hollywood getHollywoodMovie() {
		return new HollywoodComedyMovie();
	}
	public Bollywood getBollywoodMovie() {
		return new BollywoodComedyMovie();
	}
}