package gallery;

public class JpgShower implements AdvanceImage {

	@Override
	public void showPng() {
		// Nothing to do because it is related to Jpg image

	}

	@Override
	public void showJpg() {
		System.out.println("Showing JPG image");
	}

}
