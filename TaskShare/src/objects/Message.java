package objects;

public class Message {
	
	Person author;
	String message;
	Date timestamp;
	
	public Message(Person author, String message) {
		this.author = new Person(author);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return author + " (" + timestamp + "): " + message;
		
		// TODO: figure out how to format this shit in the UI
	}
}
