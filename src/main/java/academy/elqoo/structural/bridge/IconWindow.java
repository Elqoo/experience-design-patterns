package academy.elqoo.structural.bridge;


public class IconWindow implements Window{

    private boolean switchVersion;

    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        ///????
    }

    public void drawIcon(){
        draw(0,0,10,10,"White");
        draw(0,10,10,10,"Black");
    }
}
