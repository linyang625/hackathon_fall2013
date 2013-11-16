package objects;

public class Event {
	
	String title;
	String details;
	String groupName;
	Date date;
	Reminder reminder;
	
	public Event(String title, String details, String groupName,
				 Date date, Reminder reminder) {
		this.title = title;
		this.details = details;
		this.groupName = groupName;
		this.date = new Date(date);
		this.reminder = new Reminder(reminder);
	}
}
