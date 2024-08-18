package music;

public class BasicMusic implements Source {

	@Override
	public void play() {
		System.out.println("Music is getting played...");

	}

	@Override
	public void stop() {
		System.out.println("Playing music has been stopped...");

	}

}
