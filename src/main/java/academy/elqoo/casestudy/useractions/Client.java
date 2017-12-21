package academy.elqoo.casestudy.useractions;

import java.util.LinkedList;
import java.util.Queue;


public class Client {

	public static void main(String[] args){

		// Setup both screens
		Queue<UserAction> actionQueue = new LinkedList<UserAction>();

		ScreenOne screenOne = new ScreenOne(actionQueue);
		ScreenTwo screenTwo = new ScreenTwo(actionQueue);

		// simulate user actions
		screenOne.simulateUserAction();
		screenTwo.simulateUserAction();

		// keep track of the last action
		UserAction lastUserAction=null;

		// process user actions
		for (UserAction userAction : actionQueue) {
			// perform the action
			userAction.performAction();
			lastUserAction = userAction;
		}

		// undo last user action
		lastUserAction.undo();

	}


}
