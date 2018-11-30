package es.viles.app.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
	@Bean
    public Queue hello() {
        return new Queue("queue_test");
    }
	
	@Bean
    public Receiver2 receiver() {
        return new Receiver2();
    }
}
