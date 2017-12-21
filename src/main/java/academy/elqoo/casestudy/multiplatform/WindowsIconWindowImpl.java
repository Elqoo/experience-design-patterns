package academy.elqoo.casestudy.multiplatform;

public class WindowsIconWindowImpl extends IconWindow {

	@Override
	public void drawIconWindow() {
		System.out.println("Drow icon for Windows");
		drawWindow();
	}

	@Override
	public void drawWindow() {
		System.out.println("Draw application window for Windows");
	}

}
