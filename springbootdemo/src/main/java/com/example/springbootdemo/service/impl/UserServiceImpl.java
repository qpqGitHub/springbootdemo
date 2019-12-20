package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.RedisUser;
import com.example.springbootdemo.mapper.RedisUserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class UserServiceImpl implements UserService {

    private static CountDownLatch latch = new CountDownLatch(32);

    @Autowired
    private RedisUserMapper redisUserMapper;

    @Override
    public int updateAgeByUid(RedisUser redisUser) {
        ExecutorService fix = Executors.newFixedThreadPool(10);
        Future<Integer> future = null;
        // Future方法
        // get()  当任务结束后返回一个结果，如果调用时，工作没有结束，则会阻塞线程，直到任务执行完毕
        // get（long  timeout,TimeUnit unit）做多等待timeout的时间就会返回结果
        // cancel(boolean mayInterruptlfRunning) 做多等待timeout的时间就会返回结果
        // isDone()方法判断当前方法是否完成
        // isCancel()判断当前方法是否取消
        for(int i=0;i<32;i++){
            Runnable task = new Runnable() {
                //  32个线程都被挂起来了，到时候一起运行
                //  每次都计数器减一，每次都挂起来
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    RedisUser redisUser1 = redisUserMapper.selectByPrimaryKey(redisUser.getUid());
                    if(redisUser1.getUserAge()>0){
                        int a = redisUserMapper.updateAgeByUid(redisUser);
                        System.out.println("Task is running by "+Thread.currentThread().getName());
                    }
                }
            };
            latch.countDown();
            System.out.println(latch);
            future = (Future<Integer>) fix.submit(task);
        }
        fix.shutdown();
        return 0;
    }

    @Override
    public RedisUser selectByPrimaryKey(String uid) {
        return redisUserMapper.selectByPrimaryKey(uid);
    }
}
