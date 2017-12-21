package academy.elqoo.structural.decorator;


public class IconScrollbarWindow extends Window{

    @Override
    public void draw() {
        System.out.println("Draw icon");
        System.out.println("Draw scrollbar");
        super.draw();
    }
}
