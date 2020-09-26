package com.bernardo.websocketwei;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
	@MessageMapping("/picture/*")
	public Message broadcast(Message message) {
		System.out.println("oioioi");
		return message;
	}
}
