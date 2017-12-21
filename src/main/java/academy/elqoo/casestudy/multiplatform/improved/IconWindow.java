package academy.elqoo.casestudy.multiplatform.improved;

public class IconWindow extends Window{

	public IconWindow(WindowImpl impl) {
		super(impl);
	}

	public void drawIconWindow(){
		drawWindow();
		System.out.println("Draw Icon");
	}

}
