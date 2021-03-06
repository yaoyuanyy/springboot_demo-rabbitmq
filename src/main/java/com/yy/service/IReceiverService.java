package com.yy.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaoliang on 2017/2/24.
 */
@Service
@RabbitListener(queues = "springboot_rmq")
public class IReceiverService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
