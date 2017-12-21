package academy.elqoo.casestudy.useractions;

/**
 * The useraction class acts as a base class to capture user interaction
 *
 */
public interface UserAction {

	/**
	 * Whenever a user performs an action, this method must be exectued.
	 */
	void performAction();

	/**
	 * When the user want to undo his action, this method will undo the previous action;
	 *
	 */
	void undo();

}
