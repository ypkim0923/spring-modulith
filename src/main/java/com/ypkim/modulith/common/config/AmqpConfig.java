package com.ypkim.modulith.common.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfig {
    public static final String QUEUE_NAME = "modulith.queue";

    @Bean
    Queue queue() {
        return QueueBuilder.durable(QUEUE_NAME).build();
    }

    @Bean
    DirectExchange exchange() {
        return ExchangeBuilder.directExchange(QUEUE_NAME).build();
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(QUEUE_NAME);
    }
}
