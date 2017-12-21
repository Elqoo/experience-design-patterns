package academy.elqoo.casestudy.documentstructure.improved;

public class Client {

	public static void main(String [] args){

		ComposedWorldObject root = new ComposedWorldObject("root");
		ComposedWorldObject house = new ComposedWorldObject("house");

		Circle circle = new Circle("circle");
		Square square = new Square("square");

		Circle secondCircle = new Circle("secondCircle");
		Square secondSquare = new Square("secondSquare");



		// link objects together

		root.getWorldObjects().add(house);
		house.getWorldObjects().add(circle);
		house.getWorldObjects().add(square);

		root.getWorldObjects().add(secondSquare);
		root.getWorldObjects().add(secondCircle);

		// print the tree


		// root = composite object
		root.print();


	}

}
