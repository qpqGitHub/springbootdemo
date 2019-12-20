package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.RedisUser;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(RedisUser record);

    int insertSelective(RedisUser record);

    RedisUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(RedisUser record);

    int updateByPrimaryKey(RedisUser record);

    int updateAgeByUid(RedisUser record);
}