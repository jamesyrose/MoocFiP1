package Part6;

public class Message {
	private String subject;
	private String sender; 
	private String reciever; 
	private String message; 
	
	public Message(String subject, String sender, String reciever) {
		this(subject, sender, reciever, "");
		
	}
	
	public Message(String subject, String sender, String reciever, String message) {
		this.subject = subject;
		this.sender = sender; 
		this.reciever = reciever;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getSender() {
		return sender; 
	}
	
	public String getReciever() {
		return reciever;
	}

	public String getSubject() {
		return subject;
	}
		
}
