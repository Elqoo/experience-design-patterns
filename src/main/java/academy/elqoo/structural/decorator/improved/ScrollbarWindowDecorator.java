package academy.elqoo.structural.decorator.improved;


public class ScrollbarWindowDecorator extends WindowDecorator{

    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw a scrollbar");

        window.draw();
    }
}
