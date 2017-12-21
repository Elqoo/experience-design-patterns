package academy.elqoo.casestudy.multiplatform;

public class MacApplicationWindowImpl extends ApplicationWindow{



	@Override
	public void drawWindow() {
		System.out.println("Draw application window for Mac");

	}

	@Override
	public void drawApplicationWindow() {
		// draw standar window first
		drawWindow();
		System.out.println("Add mac application icon");

	}



}
