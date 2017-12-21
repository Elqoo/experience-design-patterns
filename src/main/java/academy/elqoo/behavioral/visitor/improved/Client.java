package improved;


import academy.elqoo.behavioral.visitor.improved.Car;
import academy.elqoo.behavioral.visitor.improved.Engine;
import academy.elqoo.behavioral.visitor.improved.Light;
import academy.elqoo.behavioral.visitor.improved.Wheel;

public class Client {

    public static void main(String[] args) {

        Car car = new Car();

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.getCarParts().add(new Engine());


        car.upgrade();;
        car.print();
        car.render();


    }

}
