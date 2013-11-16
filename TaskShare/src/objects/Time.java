package objects;

public class Time {

	int hour;
	int minute;
	
	// Default constructor for a null time
	public Time() {
		hour = -1;
		minute = -1;
	}
	
	// Constructor that takes in hour and minute as arguments
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	// Copy constructor
	public Time(Time time) {
		hour = time.hour;
		minute = time.minute;
	}
	
	// Returns true if time is null
	public boolean isNull() {
		return hour == -1 && minute == -1;
	}
	
	// Returns the difference in time (lhs - rhs)
	public int compareTo(Time rhs) {
		int rhsInt = (100*rhs.hour) + rhs.minute;
		int lhsInt = (100*hour) + minute;
		return lhsInt - rhsInt;
	}
	
	@Override
	public String toString() {
		if (isNull())
			return "";
		if (hour < 12)
			return hour + ":" + minute + " AM";
		else
			return (hour % 12) + ":" + minute + " PM";
			
	}
}
