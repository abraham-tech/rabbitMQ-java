package net.javaguides.orderservice.publisher;

import net.javaguides.orderservice.dto.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderProducer.class);

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.binding.routing.key}")
    private String orderRoutingKey;

    @Value("${rabbitmq.binding.email.routing.key}")
    private String emailRoutingKey;

    private RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Order order) {
        LOGGER.info(String.format("Sending order event message to rabbitMQ -> %s", order));
        rabbitTemplate.convertAndSend(exchange, orderRoutingKey, order);
    }

    public void sendEmail(Order order) {
        LOGGER.info(String.format("Sending email event message to rabbitMQ -> %s", order));
        rabbitTemplate.convertAndSend(exchange, emailRoutingKey, order);
    }
}
