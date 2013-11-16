package objects;

public class Task {
	
	String title;
	String details;
	String groupName;
	boolean done;
	Reminder reminder;
	
	// All of the constructor possibilities
	public Task(String title, String groupName) {
		this.title = title;
		this.groupName = groupName;
		done = false;
	}	
	public Task(String title, String groupName, Reminder reminder) {
		this.title = title;
		this.groupName = groupName;
		this.reminder = new Reminder(reminder);
		done = false;
	}
	public Task(String title, String details, String groupName) {
		this.title = title;
		this.details = details;
		this.groupName = groupName;
		done = false;
	}
	public Task(String title, String details, String groupName, Reminder reminder) {
		this.title = title;
		this.details = details;
		this.groupName = groupName;
		this.reminder = new Reminder(reminder);
		done = false;
	}

}
