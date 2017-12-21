package academy.elqoo.casestudy.documentstructure.improved;

import java.util.ArrayList;
import java.util.List;

public class ComposedWorldObject extends WorldObject{

	// can reference other composed world objects
	private List<WorldObject> worldObjects = new ArrayList<WorldObject>();

	private String specification;

	public ComposedWorldObject(String specification){
		this.specification = specification;
	}


	/**
	 * Delegate the print method to the referenced children
	 */
	@Override
	public void print() {
		System.out.println(specification);

		// iterate through the clients e.g worldobjects
		for (WorldObject worldObject : worldObjects) {
			worldObject.print();
		}
	}


	public List<WorldObject> getWorldObjects() {
		return worldObjects;
	}

	public void setWorldObjects(List<WorldObject> worldObjects) {
		this.worldObjects = worldObjects;
	}


	@Override
	public String getName() {
		return specification;
	}



}
