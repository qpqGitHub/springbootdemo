package com.example.springbootdemo.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    public static final String QUEUE_NAME = "log";
    public static final String QUEUE_NAME2 = "log.all";
    public static final String QUEUE_NAME3 = "log.all.error";
    public static final String EXCHANGE_NAME = "topicExchange";
    @Bean
    public Queue queuetopic(){
        return  new Queue(TopicConfig.QUEUE_NAME);
    }
    @Bean
    public Queue queuetopic2(){
        return  new Queue(TopicConfig.QUEUE_NAME2);
    }

    @Bean
    public Queue queuetopic3(){
        return new Queue(TopicConfig.QUEUE_NAME3);
    }
    // 配置交换机
    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange(TopicConfig.EXCHANGE_NAME);
    }

    // 绑定队列到交换机，并设置路由键(log.#)
    @Bean
    Binding bindingtopicExchangeQueue(Queue queuetopic,TopicExchange topicExchange){
        return BindingBuilder.bind(queuetopic).to(topicExchange).with("log.#");
    }
    // 绑定队列到交换机，并设置路由键（log.*）
    @Bean
    Binding bindingtopicExchangeQueue2(Queue queuetopic2,TopicExchange topicExchange){
        return BindingBuilder.bind(queuetopic2).to(topicExchange).with("log.*");
    }
    // 绑定队列到交换机，并设置路由键()log.*.error）
    @Bean
    Binding bindingtopicExchangeQueue3(Queue queuetopic3,TopicExchange topicExchange){
        return BindingBuilder.bind(queuetopic3).to(topicExchange).with("log.*.error");
    }

}
