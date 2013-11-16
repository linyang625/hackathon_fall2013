package objects;

public class Date implements Comparable<Date> {
	
	int year;
	int month;
	int day;
	Time time;
	
	// Default constructor for a null date
	public Date() {
		year = 0;
		month = 0;
		day = 0;
		time = new Time();
	}
	
	// Constructor that takes in year, month, and day as parameters
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// Copy constructor
	public Date(Date date) {
		year = date.year;
		month = date.month;
		day = date.day;
	}

	// Returns the difference in time (lhs - rhs)
	public int compareTo(Date rhs) {
		int rhsInt = (10000*rhs.year) + (100*rhs.month) + rhs.day;
		int lhsInt = (10000*year) + (100*month) + day;
		return lhsInt - rhsInt;
	}
	
	@Override
	public String toString() {
		String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        
        return monthString + " " + day + ", " + year + " " + time;
	}
}
