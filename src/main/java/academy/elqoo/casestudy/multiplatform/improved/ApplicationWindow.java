package academy.elqoo.casestudy.multiplatform.improved;

public class ApplicationWindow extends Window{

	public ApplicationWindow(WindowImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	public void drawApplicationWindow(){
		drawWindow();
		System.out.println("Draw Application Icon");

	}


}
