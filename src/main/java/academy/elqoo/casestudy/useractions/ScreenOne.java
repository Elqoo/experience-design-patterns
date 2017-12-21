package academy.elqoo.casestudy.useractions;

import java.util.Queue;

public class ScreenOne {

	// references the actions queue
	private Queue<UserAction> actionQueue;

	public ScreenOne(Queue<UserAction> actonQueue){
		this.actionQueue = actonQueue;
	}

	/**
	 * We simulate the user wanting to print something on the screen
	 */
	public void simulateUserAction(){
		PrintUserAction action = new PrintUserAction("screen one action");
		actionQueue.add(action);
	}

}
