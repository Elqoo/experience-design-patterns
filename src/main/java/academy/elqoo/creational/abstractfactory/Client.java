package academy.elqoo.creational.abstractfactory;

public class Client {


	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new YellowThemeScrollbar();
        Window window = new YellowThemeWindow();

        initializeGUI(bar,window);


        bar = new YellowThemeScrollbar();
        window = new PinkThemeWindow();

        initializeGUI(bar, window);


	}



}
