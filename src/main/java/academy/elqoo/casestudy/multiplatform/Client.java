package academy.elqoo.casestudy.multiplatform;

public class Client {

	public static void main(String [] args){

		// suppose we run on windows
		ApplicationWindow window = new WindowsApplicationWindowImpl();
		window.drawApplicationWindow();

		// Change it to Mac
		window = new MacApplicationWindowImpl();
		window.drawApplicationWindow();


	}


}
