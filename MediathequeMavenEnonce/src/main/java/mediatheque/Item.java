package mediatheque;

public abstract class Item {
	private String title;

	public Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "title=" + title ;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void accept(ItemVisitor v);
	
}
