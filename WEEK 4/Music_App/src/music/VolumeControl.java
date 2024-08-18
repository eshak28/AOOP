package music;

public class VolumeControl implements Source {
	  private Source musicSource;
	    private int volumeLevel;
	    public VolumeControl(Source musicSource) {
	        this.musicSource = musicSource;
	        this.volumeLevel = 5; // Default volume level
	    }

	@Override
	public void play() {
		 System.out.println("Setting volume to " + volumeLevel);
	        musicSource.play();

	}

	@Override
	public void stop() {
		  musicSource.stop();

	}


public void setVolume(int level) {
    this.volumeLevel = level;
}
}

