package com.example.springbootdemo.mq.java;

import com.example.springbootdemo.mq.TopicConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void topicSender(String message){
        String routingKey = "log.all.error";
        System.out.println(routingKey+"发生消息"+message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME,routingKey,message);
    }




}
