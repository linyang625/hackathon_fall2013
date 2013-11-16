package objects;

public class Reminder implements Comparable<Reminder> {
	
	Date date;
	String title;
	
	public Reminder(Date date, String title) {
		this.date = new Date(date);
		this.title = title;
	}
	
	// Copy constructor
	public Reminder(Reminder reminder) {
		date = reminder.date;
		title = reminder.title;
	}

	@Override
	public int compareTo(Reminder rhs) {
		return date.compareTo(rhs.date);
	}
	
}
