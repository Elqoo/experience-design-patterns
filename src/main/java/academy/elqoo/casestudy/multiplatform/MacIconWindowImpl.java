package academy.elqoo.casestudy.multiplatform;

public class MacIconWindowImpl extends IconWindow{

	@Override
	public void drawIconWindow() {
		System.out.println("Drow icon for Mac");
		drawWindow();
	}

	@Override
	public void drawWindow() {
		System.out.println("Draw application window for Mac");
	}

}
