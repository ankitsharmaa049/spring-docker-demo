package com.ankit.springdockerdemo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

@Repository
public class CountDao {

    public static final String HASH = "count";
    @Autowired
    RedisTemplate redisTemplate;

    public Integer getCount(){
        Integer count = (Integer) redisTemplate.opsForHash().get(HASH, "count");
        if(Objects.isNull(count))
            count = 1;
        else
            count++;
        redisTemplate.opsForHash().put(HASH,"count",count);
        return count;
    }
}
