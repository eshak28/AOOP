package music;

public class OnlineAdapter implements Source {
	 private OnlineStreamingService onlineStreamingService;

	    public OnlineAdapter(OnlineStreamingService onlineStreamingService) {
	        this.onlineStreamingService = onlineStreamingService;
	    }
	@Override
	public void play() {
		  onlineStreamingService.startStreaming();

	}

	@Override
	public void stop() {
		  onlineStreamingService.stopStreaming();
    }
	}

class OnlineStreamingService {
    public void startStreaming() {
        System.out.println("Streaming online music...");
    }

    public void stopStreaming() {
        System.out.println("Stopping online streaming...");
    }
}
