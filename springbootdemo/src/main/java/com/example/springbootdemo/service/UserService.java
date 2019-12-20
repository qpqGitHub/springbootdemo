package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.RedisUser;

public interface UserService {
   int updateAgeByUid(RedisUser redisUser);

    RedisUser selectByPrimaryKey(String uid);
}
