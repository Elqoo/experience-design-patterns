package academy.elqoo.behavioral.visitor;


public class Engine extends CarPart{
    @Override
    void print() {
        System.out.println("Engine");
    }

    @Override
    void render() {
        System.out.println("Render engine");
    }

    @Override
    void upgrade() {
        System.out.println("Upgrade engine");
    }
}
