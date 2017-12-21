package academy.elqoo.behavioral.visitor.improved;


import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts = new ArrayList<CarPart>();

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public void render(){
        RenderCarPartVisitor renderer = new RenderCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(renderer);
        }
    }

    public void print(){
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(visitor);
        }
    }

    public void upgrade(){
        UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(visitor);
        }
    }

}
