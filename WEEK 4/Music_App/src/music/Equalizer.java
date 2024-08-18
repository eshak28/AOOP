package music;

public class Equalizer implements Source {
	 private Source musicSource;
	  public Equalizer(Source musicSource) {
	        this.musicSource = musicSource;
	    }
	 @Override
	public void play() {
		 System.out.println("Applying equalizer settings...");
	        musicSource.play();
	}

	@Override
	public void stop() {
		 musicSource.stop();
	}

}
