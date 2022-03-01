package ObjectAdapterChallenge;

interface MediaPlayer {
	
      public void play(String audioType, String fileName);
}
class AudioPlayer implements MediaPlayer {
	
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing " + audioType +
					" file. Name: " + fileName);
		}else {
			System.out.println("Invalid audio type");
		}
	}
}
