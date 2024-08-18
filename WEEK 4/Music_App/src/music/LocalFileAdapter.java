package music;

public class LocalFileAdapter implements Source {
	 private LocalFilePlayer localFilePlayer;

	    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
	        this.localFilePlayer = localFilePlayer;
	    }
	  
	@Override
	public void play() {
		   localFilePlayer.playFile();

	}

	@Override
	public void stop() {
		  localFilePlayer.stopFile();
	}

}
	    class LocalFilePlayer {
	        public void playFile() {
	            System.out.println("Playing local file...");
	        }

	        public void stopFile() {
	            System.out.println("Stopping local file...");
	        }
	    }
