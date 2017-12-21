package academy.elqoo.creational.prototype.improved;

public class Image extends Graphic{

	private String url;

	@Override
	public Graphic clone() {
		// create new clone
		Image clone = new Image();
		clone.setUrl(this.url);
		return clone;
	}

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
		this.url = url;
	}

}
