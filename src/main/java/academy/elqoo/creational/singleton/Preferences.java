package academy.elqoo.creational.singleton;


public class Preferences {

    public static Preferences globalPreferences = new Preferences("First one created");

    private String preference;

    public Preferences(String preference){
        this.preference = preference;
    }

    public String getPreferencesDetail(){
        return preference;
    }

}
