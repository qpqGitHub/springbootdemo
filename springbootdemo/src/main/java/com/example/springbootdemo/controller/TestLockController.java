package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.RedisUser;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLockController {

    @Autowired
    private UserService userService;
    @RequestMapping("/testlock")
    public RedisUser testlock(String param) throws Exception{
        RedisUser redisUser = new RedisUser();
        redisUser.setUid(param);
        int updateAgeById = userService.updateAgeByUid(redisUser);
        Thread.sleep(8000);
        System.out.println("更新用户年龄成功"+updateAgeById);
        RedisUser redisUser1 =  userService.selectByPrimaryKey(param);
        return  redisUser1;
    }
}
