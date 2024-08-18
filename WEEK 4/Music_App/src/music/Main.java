package music;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Source musicSource = null;

		        while (true) {
		            System.out.println("\n--- Music Streaming App ---");
		            System.out.println("1. Play Local File");
		            System.out.println("2. Stream Online Music");
		            System.out.println("3. Tune into Radio");
		            System.out.println("4. Add Volume Control");
		            System.out.println("5. Add Equalizer");
		            System.out.println("6. Play Music");
		            System.out.println("7. Stop Music");
		            System.out.println("8. Exit");
		            System.out.print("Select an option: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    musicSource = new LocalFileAdapter(new LocalFilePlayer());
		                    System.out.println("Selected: Local File");
		                    break;
		                case 2:
		                    musicSource = new OnlineAdapter(new OnlineStreamingService());
		                    System.out.println("Selected: Online Streaming");
		                    break;
		                case 3:
		                    musicSource = new Radio(new RadioStation());
		                    System.out.println("Selected: Radio Station");
		                    break;
		                case 4:
		                    if (musicSource != null) {
		                        System.out.print("Set volume level (1-10): ");
		                        int volume = scanner.nextInt();
		                        musicSource = new VolumeControl(musicSource);
		                        ((VolumeControl) musicSource).setVolume(volume);
		                        System.out.println("Volume Control added with level " + volume + ".");
		                    } else {
		                        System.out.println("Please select a music source first!");
		                    }
		                    break;
		                case 5:
		                    if (musicSource != null) {
		                        musicSource = new Equalizer(musicSource);
		                        System.out.println("Equalizer added.");
		                    } else {
		                        System.out.println("Please select a music source first!");
		                    }
		                    break;
		                case 6:
		                    if (musicSource != null) {
		                        musicSource.play();
		                    } else {
		                        System.out.println("Please select a music source first!");
		                    }
		                    break;
		                case 7:
		                    if (musicSource != null) {
		                        musicSource.stop();
		                    } else {
		                        System.out.println("No music is playing.");
		                    }
		                    break;
		                case 8:
		                    System.out.println("Exiting the application...");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid option. Please try again.");
		                    break;
		            }
		        }
		    }
		


	}


