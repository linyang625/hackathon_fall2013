package objects;

import java.util.ArrayList;

public class MessageThread {
	
	ArrayList<Message> messages;
	
	public MessageThread() {
		messages = new ArrayList<Message>();
	}
	
	public void addMessage(Message newMessage) {
		messages.add(newMessage);
	}
	
	@Override
	public String toString() {
		String messageThread = "";
		for (Message m : messages)
			messageThread += m + "\n";
		return messageThread;
	}
}
