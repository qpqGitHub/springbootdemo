package com.example.springbootdemo.mq.java;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "log")
public class TopicReceiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("log.#消费消息"+msg);
    }
}
