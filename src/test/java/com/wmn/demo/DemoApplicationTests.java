package com.wmn.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
        RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("name","wmn");
        redisTemplate.opsForValue().append("name","append");
        redisTemplate.boundValueOps("name1").set("wmn1");
        System.out.println(redisTemplate.opsForValue().get("name"));
        System.out.println(redisTemplate.opsForValue().get("name1"));



    }

}
