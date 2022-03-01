package ObjectAdapterChallenge;

interface AdvancedMediaPlayer {

    public void loadFileName(String fileName);
    public void listen();
}
class mp4Player implements AdvancedMediaPlayer {
	
	String myFile;
	
	public void loadFileName(String fileName) {
		myFile=fileName;
	}
	public void listen() {
		System.out.println("Playing mp4 file. Name: " + myFile);
	}
}
class vlcPlayer implements AdvancedMediaPlayer {
	
	String myFile;
	
	public void loadFileName(String fileName) {
		myFile=fileName;
	}
	public void listen() {
		System.out.println("Playing vlc file. Name: " + myFile);
	}
}
