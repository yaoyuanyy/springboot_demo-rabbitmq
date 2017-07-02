package com.yy.test;

import com.yy.MyApp;
import com.yy.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yaoliang on 2017/2/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyApp.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

    @Autowired
    private Sender sender;
    @Test
    public void send() throws Exception {
        sender.send();
    }

}
