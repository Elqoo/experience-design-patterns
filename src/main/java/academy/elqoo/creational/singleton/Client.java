package academy.elqoo.creational.singleton;


public class Client {

    public static void main(String[] args) {

        System.out.println(Preferences.globalPreferences.getPreferencesDetail());

        Preferences secondPreference = new Preferences("Second preference");

        Preferences.globalPreferences = secondPreference;

        System.out.println(Preferences.globalPreferences.getPreferencesDetail());


    }

}
