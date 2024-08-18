package gallery;


public class ImageAdapter implements ImageView {

	private AdvanceImage advancedImageViewer;
	    public ImageAdapter(String imageType) {
	        if (imageType.equalsIgnoreCase("png")) {
	            advancedImageViewer = new Pngshower();
	        } else if (imageType.equalsIgnoreCase("jpg")) {
	            advancedImageViewer = new JpgShower();
	        }
	    }


	@Override
	public void show() {
		 if (advancedImageViewer instanceof Pngshower) {
	            advancedImageViewer.showPng();
	        } else if (advancedImageViewer instanceof JpgShower) {
	            advancedImageViewer.showJpg();
	        }
	    }
	}


