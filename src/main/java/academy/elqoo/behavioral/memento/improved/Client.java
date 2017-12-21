package academy.elqoo.behavioral.memento.improved;


import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {
        ConnectionSolver connectionSolver = new ConnectionSolver();
        ConnectionSolverCaretaker caretaker = new ConnectionSolverCaretaker();


        connectionSolver.setFirstPoint(new Point2D.Double(1.0,1.0));
        connectionSolver.setSecondPoint(new Point2D.Double(5.0, 1.0));

        caretaker.saveState(connectionSolver);



        connectionSolver.calculateLine();


        connectionSolver.setFirstPoint(new Point2D.Double(2.0,2.0));
        connectionSolver.setSecondPoint(new Point2D.Double(5.0, 1.0));

        connectionSolver.calculateLine();

        ConnectionSolver newConnectionSolver = new ConnectionSolver();


        caretaker.restoreState(newConnectionSolver);


        newConnectionSolver.calculateLine();


        caretaker.restoreState(connectionSolver);

        connectionSolver.calculateLine();

    }

}
