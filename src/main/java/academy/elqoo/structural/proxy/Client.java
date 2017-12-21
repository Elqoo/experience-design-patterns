package academy.elqoo.structural.proxy;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Image image = new Image("test image");
        Image image2 = new Image("second image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);


        System.out.println("Application setup");

        application.draw();
    }

}
