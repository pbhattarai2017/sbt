public class Todo {

	// Each Todo instance is assigned a unique ID by
	// incrementing this static (shared by all Todo instances) variable
	private static int nextID = 1;

	private int id;
	private String title;

	public Todo(String title) {
		this.id = nextID;
		this.title = title;
		nextID++;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
