package academy.elqoo.casestudy.multiplatform;

public class WindowsApplicationWindowImpl extends ApplicationWindow{

	@Override
	public void drawWindow() {
		System.out.println("Draw application window for Windows");

	}

	@Override
	public void drawApplicationWindow() {
		drawWindow();
		System.out.println("Add windows application icon");

	}

}
