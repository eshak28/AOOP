package music;

public class Radio implements Source {
	 private RadioStation radioStation;

	    public Radio(RadioStation radioStation) {
	        this.radioStation = radioStation;
	    }
	@Override
	public void play() {
		 radioStation.tuneIn();

	}

	@Override
	public void stop() {
		  radioStation.tuneOut();
	}

}
class RadioStation {
    public void tuneIn() {
        System.out.println("Tuning into the radio station...");
    }

    public void tuneOut() {
        System.out.println("Tuning out of the radio station...");
    }
}
