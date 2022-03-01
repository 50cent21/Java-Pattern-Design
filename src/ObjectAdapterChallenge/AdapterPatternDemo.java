package ObjectAdapterChallenge;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		MediaPlayer mp1=new AudioPlayer();
		mp1.play("mp3", "WelcomeToHeartBreak.mp3");
		
		AdvancedMediaPlayer amp1= new mp4Player();
		MediaPlayer ampa1= new AdvancedMediaPlayerAdapter(amp1);
		ampa1.play("mp4", "ColdestWinter.mp4");
		
		AdvancedMediaPlayer amp2=new vlcPlayer();
		MediaPlayer ampa2= new AdvancedMediaPlayerAdapter(amp2);
		ampa2.play("vlc", "Amazing.vlc");
	}

}
