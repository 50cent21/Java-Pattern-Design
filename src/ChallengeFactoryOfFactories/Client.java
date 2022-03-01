package ChallengeFactoryOfFactories;

public class Client {

	public static void main(String[] args) {
		FactoryMovieInterface actionMovies=FactoryProducer.getFactory("ACTION");
		Hollywood hmovie1=actionMovies.getHollywoodMovie();
		System.out.println(hmovie1.getMovieName());
        Bollywood bmovie1=actionMovies.getBollywoodMovie();
        System.out.println(bmovie1.getMovieName());
        
        FactoryMovieInterface comedyMovies=FactoryProducer.getFactory("COMEDY");
		Hollywood hmovie2=comedyMovies.getHollywoodMovie();
		System.out.println(hmovie2.getMovieName());
        Bollywood bmovie2=comedyMovies.getBollywoodMovie();
        System.out.println(bmovie2.getMovieName());
	}

}
