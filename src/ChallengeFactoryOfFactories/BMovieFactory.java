package ChallengeFactoryOfFactories;

public abstract class BMovieFactory {

	public abstract Bollywood getName(String name);
}
class BollywoodFactory extends BMovieFactory {
	
	public Bollywood getName(String movieName) {
		if(movieName==null) {
			return null;
		}else if(movieName.equalsIgnoreCase("Bombay")) {
			return new BollywoodActionMovie();
		}else if(movieName.equalsIgnoreCase("Delhi")) {
			return new BollywoodComedyMovie();
		}
		return null;
	}
}
