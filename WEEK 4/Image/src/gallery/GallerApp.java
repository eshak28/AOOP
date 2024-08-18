package gallery;

public class GallerApp implements ImageView {
	private ImageAdapter imageAdapter;

    public GallerApp(String imageType) {
        imageAdapter = new ImageAdapter(imageType);
    }
	@Override
	public void show() {
		  imageAdapter.show();
	}
	 public static void main(String[] args) {
	        GallerApp galleryApp1 = new GallerApp("png");
	        galleryApp1.show();

	        GallerApp galleryApp2 = new GallerApp("jpg");
	        galleryApp2.show();

	}

}

