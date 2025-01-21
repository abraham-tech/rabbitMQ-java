package net.javaguides.orderservice.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Value("${rabbitmq.queue.order.name}")
    private String queueName;

    @Value("${rabbitmq.queue.email.name}")
    private String emailQueueName;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.binding.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.binding.email.routing.key}")
    private String emailRoutingKey;

    // spring bean for queue - order queue
    @Bean
    public Queue orderQueue() {
        return new Queue(queueName);
    }

    @Bean
    public Queue emailQueue() {
        return new Queue(emailQueueName);
    }

    // spring bean for exchange
    @Bean
    public TopicExchange orderExchange() {
        return new TopicExchange(exchangeName);
    }
    // spring bean for binding between exchange and queue using routing key
    @Bean
    public Binding orderBinding() {
        return BindingBuilder
                .bind(orderQueue())
                .to(orderExchange())
                .with(routingKey);
    }

    @Bean
    public Binding emailBinding() {
        return BindingBuilder
                .bind(emailQueue())
                .to(orderExchange())
                .with(emailRoutingKey);
    }

    // Configure Jackson2JsonMessageConverter
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    // Configure RabbitTemplate with the custom message converter
    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }

}
