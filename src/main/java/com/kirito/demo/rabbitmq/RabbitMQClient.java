package com.kirito.demo.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
@Slf4j
public class RabbitMQClient {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        log.info("RabbitMQClient: {},{}", message, new Date());
        rabbitTemplate.convertAndSend(QueueConstants.TEST, message);
    }
}
