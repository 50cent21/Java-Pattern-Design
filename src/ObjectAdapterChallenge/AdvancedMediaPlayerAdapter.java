package ObjectAdapterChallenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer amp;
	
	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer amp) {
		this.amp=amp;
	}
	
	public void play(String audioType, String fileName) {
		amp.loadFileName(fileName);
		amp.listen();
	}

	
}
