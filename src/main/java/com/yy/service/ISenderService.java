package com.yy.service;

import com.yy.util.Constants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaoliang on 2017/2/24.
 */
@Service
public class ISenderService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        System.out.println("send ...");

        String msg = "nihao, yy";
        amqpTemplate.convertAndSend(Constants.QUEUE_NAME, msg);
    }
}
