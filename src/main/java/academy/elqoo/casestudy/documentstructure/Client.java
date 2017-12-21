package academy.elqoo.casestudy.documentstructure;



public class Client {

	public static void main(String[] args){

		// this represents the root tree node
		Composed root = new Composed();

		root.getCircles().add(new Circle());
		root.getCircles().add(new Circle());
		root.getSquares().add(new Square());
		root.getSquares().add(new Square());


		// retrieve the tree
		// call the print method

		for (Circle circle : root.getCircles()) {
			circle.print();
		}

		for (Square square : root.getSquares()) {
			square.print();
		}


	}

}
