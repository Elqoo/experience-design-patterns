package academy.elqoo.structural.decorator;


public class Client {

    public static void main(String[] args) {

        IconWindow iconWindow = new IconWindow();
        iconWindow.draw();

        ScrollbarWindow scrollbarWindow = new ScrollbarWindow();
        scrollbarWindow.draw();


        IconScrollbarWindow iconScrollbarWindow = new IconScrollbarWindow();
        iconScrollbarWindow.draw();

    }

}
