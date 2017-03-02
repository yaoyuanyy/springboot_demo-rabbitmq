package com.yy.config;

import com.yy.util.Constants;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yaoliang on 2017/2/24.
 */

@Configuration
public class MQConfig {

    @Bean
    public Queue queue(){
        return new Queue(Constants.QUEUE_NAME);
    }

}
