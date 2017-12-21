package academy.elqoo.structural.bridge;


public class DirectXWindow implements Window {
    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        System.out.println("Drawing on direct x: "+x+" y: "+y+"  width: "+width+ " height "+height);
    }
}
