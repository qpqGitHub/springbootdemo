package com.example.springbootdemo.mq.java;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout2")
public class FanoutReceiver2 {
    @RabbitHandler
    public void proess(String message){
        System.out.println("Fanout(FanoutReceiver2)消费消息"+message);
    }
}
