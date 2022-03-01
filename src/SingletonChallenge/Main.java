package SingletonChallenge;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Trying to make a captain for our team");
		cricketCaptain cp1=cricketCaptain.getInstance();
		System.out.println("New Captain is selected: " + cp1);
		System.out.println("Trying to make another captain for our team");
		cricketCaptain cp2=cricketCaptain.getInstance();
		if(cp1.equals(cp2))
			System.out.println("You already have a Captain for your team."
					+ " Send him for the toss.");
		
	}

}
