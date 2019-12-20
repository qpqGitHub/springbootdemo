package com.example.springbootdemo.mq;

/*
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {
    final static String QUEUE_NAME = "direct";
    final static String EXCHANGE_NAME = "mydirect";
    @Bean
    public Queue queue(){
        // 声明队列 参数1：队列名称  参数2：是否持久化
        return  new Queue(DirectConfig.QUEUE_NAME, false);
    }
    //  配置默认的交换机，以下部分都可以不配置，不设置默认交换机（AMQP default）
    @Bean
    DirectExchange directExchange(){
        // 参数1：交换机名称  参数二：是否持久化  参数三：是否自动删除信息
        return  new DirectExchange(DirectConfig.EXCHANGE_NAME, false,false);
    }
    // 绑定direct队列到上面配置的mydirect路由器
    @Bean
    Binding bingingExchangeDirectQueue(Queue directQueue, DirectExchange directExchange){
        return BindingBuilder.bind(directQueue).to(directExchange).with(DirectConfig.QUEUE_NAME);
    }

}
*/
