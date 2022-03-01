package ChallengeFactoryOfFactories;

interface Hollywood {
	String getMovieName();
}
class HollywoodActionMovie implements Hollywood {
	
	public String getMovieName() {
		return "True Lies is a Hollywood Action Movie";
	}
}
class HollywoodComedyMovie implements Hollywood {
	
	public String getMovieName() {
		return "The Jerk is a Hollywood Comedy Movie";
	}
}