package SingletonChallenge;

public class cricketCaptain {

	private static int data;
	
	private cricketCaptain() {}
	
	private static class cricketCaptainHelper {
		
		private static final cricketCaptain cp=new cricketCaptain();
		
	}
	public static cricketCaptain getInstance() {
		return cricketCaptainHelper.cp;
	}
	
}
