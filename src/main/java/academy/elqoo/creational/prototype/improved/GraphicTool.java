package academy.elqoo.creational.prototype.improved;


/**
 * This class is part of the GUI framework.
 *
 *
 */
public class GraphicTool {

	private Graphic prototype;

	/**
	 * Crates a graphictool by using a prototype
	 * @param prototype
	 */
	public GraphicTool(Graphic prototype){
		this.prototype = prototype;
	}


	/**
	 * Method internal to the framework
	 * @return
	 */
	protected Graphic createGraphic(){
		return prototype.clone();
	}

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }
}
