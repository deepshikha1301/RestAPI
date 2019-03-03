package org.restful.demo.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.restful.demo.messenger.database.Database;
import org.restful.demo.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> msg = Database.getMessages();

	public MessageService() {
		msg.put(1L, new Message(1, "hello", "Deepshikha"));
		msg.put(2L, new Message(2, "hello", "Tarang"));
	}
	
	public List<Message> getAllMessags(){
		return new ArrayList<Message>(msg.values());
		/*Message m1 = new Message(1, "hello", "Deepshikha");
		Message m2 = new Message(2, "hello, How are you?", "Tarang");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;*/
	}
	
	public Message getMessage(long id) {
		return msg.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(msg.size()+1);
		msg.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		msg.put(message.getId(), message);
		return message;
	}
	
	public Message deleteMessage(long id) {
		return msg.remove(id);
	}
}
