public class Todo {

	private static int nextID = 1;

	private int id;
	private String title;
	private String userid;

	public Todo(String title, String userid) {
		this.id = nextID;
		this.title = title;
		this.userid = userid;
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

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		Todo.nextID = nextID;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setId(int id) {
		this.id = id;
	}

}
