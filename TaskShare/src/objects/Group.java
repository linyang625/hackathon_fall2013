package objects;

import java.util.ArrayList;

public class Group {

	ArrayList<Person> members;
	ArrayList<Event> events;
	ArrayList<Task> tasks;
	MessageThread posts;
	
	public Group() {
		members = new ArrayList<Person>();
		events = new ArrayList<Event>();
		tasks = new ArrayList<Task>();
		posts = new MessageThread();
	}
	
	public void addMember(Person newMember) {
		members.add(newMember);
	}
}
