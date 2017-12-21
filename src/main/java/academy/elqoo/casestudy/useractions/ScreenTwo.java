package academy.elqoo.casestudy.useractions;

import java.util.Queue;

public class ScreenTwo {

	private Queue<UserAction> actionQueue;

	public ScreenTwo(Queue<UserAction> actonQueue){
		this.actionQueue = actonQueue;
	}

	public void simulateUserAction(){
		PrintUserAction action = new PrintUserAction("screen two action");
		actionQueue.add(action);
	}

}
