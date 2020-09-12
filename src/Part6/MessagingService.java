package Part6;

import java.util.ArrayList;

public class MessagingService {
	private static ArrayList<Message> messages;
	
	public MessagingService() {
		this.messages = new ArrayList<>();
	}
	
	public void add(Message message) {
		messages.add(message);
	}
	
	public ArrayList<Message> getMessages(){
		return messages;
	}
}
