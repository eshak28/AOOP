package gallery;

public class Pngshower implements AdvanceImage {
    public void showPng() {
        System.out.println("Showing PNG image");
    }

    @Override
    public void showJpg() {
        // Do nothing, this is specifically for PNG
    }
}
