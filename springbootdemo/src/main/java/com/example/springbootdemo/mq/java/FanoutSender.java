package com.example.springbootdemo.mq.java;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTempplate;

    public void send(String message){
        System.out.println("发送消息"+message);
        this.rabbitTempplate.convertAndSend(FanoutConfig.EXCHANGE_NAME,FanoutConfig.QUEUE_NAME,message);
    }
    public void send2(String message){
        System.out.println("发生消息2"+message);
        this.rabbitTempplate.convertAndSend(FanoutConfig.EXCHANGE_NAME,FanoutConfig.QUEUE_NAME2,message);
    }
}
*/
