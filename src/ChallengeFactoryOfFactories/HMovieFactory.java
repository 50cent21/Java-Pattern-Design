package ChallengeFactoryOfFactories;

public abstract class HMovieFactory {

	public abstract Hollywood getMovie(String name);
}
class HollywoodFactory extends HMovieFactory {
	public Hollywood getMovie(String movieName) {
		if(movieName==null) {
			return null;
		}else if(movieName.equals("JamesBond")) {
			return new HollywoodActionMovie();
		}else if(movieName.equals("AceVentura")) {
			return new HollywoodComedyMovie();
		}
		return null;
	}
}
