package academy.elqoo.creational.abstractfactory.improved;

public class Client {


	public static void initializeGUI(WidgetFactory factory){
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}

	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initazation logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

        factory = new  YellowThemeWidgetFactory();
        initializeGUI(factory);


	}



}
