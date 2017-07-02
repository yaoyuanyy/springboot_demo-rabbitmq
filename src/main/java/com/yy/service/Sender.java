package com.yy.service;

import com.yy.config.MQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        System.out.println("发送消息...");
        rabbitTemplate.convertAndSend(MQConfig.QUEUE_NAME, "你好, skyler");
    }
}