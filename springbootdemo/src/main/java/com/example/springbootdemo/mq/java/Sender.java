package com.example.springbootdemo.mq.java;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *消息发送者-生产消息
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void driectSend(String message){
        System.out.println("Direct 发送消息：" +message);
        // 参数一：交换机名称 可以省略，参数二：路由键名称，direct模式下，路由键名称就算queue名称，参数三，存储消息
        this.rabbitTemplate.convertAndSend("direct",message);
    }


}
