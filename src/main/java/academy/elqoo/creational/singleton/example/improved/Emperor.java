package academy.elqoo.creational.singleton.example.improved;

/**
 * This is the evil Emperor, all shall bow to his power...
 */
public class Emperor {

    private static Emperor instance = null;

    /**
     * Private constructor so we must pass via the awake method.
     */
    protected Emperor(){

    }

    /**
     * Awakes the Emperor and returns it.
     *
     * @return the emperor
     */
    public synchronized static Emperor awake(){
        if (instance == null){

            instance = new Emperor();

        }
        return instance;
    }


}
