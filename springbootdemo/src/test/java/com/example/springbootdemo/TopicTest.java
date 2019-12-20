package com.example.springbootdemo;

import com.example.springbootdemo.mq.java.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest extends  SpringbootdemoApplicationTests {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void Test(){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        topicSender.topicSender("Time1 => " + sf.format(new Date()));
    }
}
*/
