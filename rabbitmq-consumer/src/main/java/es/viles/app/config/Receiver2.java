package es.viles.app.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "queue_test")
public class Receiver2 {

	@RabbitHandler
	public void receive(String in) {
		System.out.println(" [x] Received '" + in + "'");
	}
}