package com.yy.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaoliang on 2017/2/24.
 */
@Service
public class IReceiverService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitListener(queues = "springboot_rmq")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
