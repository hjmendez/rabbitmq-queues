package es.viles.app.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.viles.app.dto.Message;


@RestController
@RequestMapping("messages")
public class MessageController {

	public static final String EXCHANGE_NAME = "echange";
	public static final String ROUTING_KEY = "";
	private static final String QUEUE_NAME = "queue_test";
	private static final boolean IS_DURABLE_QUEUE = true;
	

	@Autowired
	RabbitTemplate rabbitTemplate;

	@GetMapping("/{txt}")
	public Message sendMessage(@PathVariable String txt) {
		Message msg = new Message();
		rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, txt);
		msg.setTxt(txt);
		return msg;
	}

}
