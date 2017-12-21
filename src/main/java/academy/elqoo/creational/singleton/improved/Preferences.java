package academy.elqoo.creational.singleton.improved;

public class Preferences {

	// holder of the single instance for the singleton class
    private static Preferences instance = null;

    /**
     * No other classes can instantiate a singleton
     */
    protected Preferences() {}

    /**
     * Create a singleton instance.
     *
     * Use synchronized to allow one one instance when using multiple threads
     */
    private synchronized static void createInstance () {
        if (instance == null) instance = new Preferences();
    }

    /**
     * Access method to get hold of singleton instance
     * @return the one singleton instance
     */
    public static Preferences getInstance () {
        if (instance == null) createInstance ();
        return instance;
    }

    public void helloSingleton(){
    	System.out.println("Hello i'm a singleton");
    }

}
