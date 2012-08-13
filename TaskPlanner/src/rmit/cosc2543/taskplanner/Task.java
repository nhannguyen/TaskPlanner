package rmit.cosc2543.taskplanner;

import java.util.Date;

public class Task {

	private String name;
	private Date dueDate;
	private int categoryId;
	
	public String getName() {
		return name;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public int getCategoryId() {
		return categoryId;
	}
}
