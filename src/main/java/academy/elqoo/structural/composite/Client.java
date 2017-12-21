package academy.elqoo.structural.composite;


public class Client {

    public static void main(String[] args) {
        GraphicItemGroup group = new GraphicItemGroup();

        group.getLines().add(new Line());
        group.getLines().add(new Line());
        group.getLines().add(new Line());

        group.getRectangles().add(new Rectangle());
        group.getRectangles().add(new Rectangle());
        group.getRectangles().add(new Rectangle());
        group.getRectangles().add(new Rectangle());

        // draw everything
        group.draw();
    }

}
