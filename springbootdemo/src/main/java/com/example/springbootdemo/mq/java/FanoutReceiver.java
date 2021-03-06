package com.example.springbootdemo.mq.java;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout")
public class FanoutReceiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Fanout(FanoutReceiver)消费消息"+msg);
    }
}
