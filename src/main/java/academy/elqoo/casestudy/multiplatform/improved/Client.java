package academy.elqoo.casestudy.multiplatform.improved;

public class Client {

	public static void main(String [] args){

		// suppose we run on windows
		WindowImpl windowImpl = new WindowsWindowImpl();

		ApplicationWindow window = new ApplicationWindow(windowImpl);
		window.drawApplicationWindow();

		// suppose we run on mac
		WindowImpl macImpl = new MacWindowImpl();

		window.setImpl(macImpl);

		window.drawApplicationWindow();
	}


}
