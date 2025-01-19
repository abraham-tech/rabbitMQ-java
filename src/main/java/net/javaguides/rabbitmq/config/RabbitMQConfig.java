package net.javaguides.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {


    @Value("${rabbitmq.queue.name}")
    private String queueName;

    @Value("${rabbitmq.json.queue.name}")
    private String jsonQueueName;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.routing.json.key}")
    private String jsonRoutingKey;
    // spring bean for rabbitMQ queue
    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    // Spring bean for rabbitmq exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(queueName);
    }

    // Binding between queue and exchange using routing key
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(routingKey);
    }

    // spring bean for queue to store json messages
    @Bean
    public Queue jsonQueue() {
        return new Queue(jsonQueueName);
    }

    // Binding between json queue and exchange using routing key
    public Binding bindingJson(TopicExchange exchange) {
        return BindingBuilder.bind(jsonQueue()).to(exchange).with(jsonRoutingKey);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageCo nverter());
        return rabbitTemplate;
    }

    // TODO
    // ConnectionFactory
    // RabbitTemplate
    // RabbitAdmin
}
