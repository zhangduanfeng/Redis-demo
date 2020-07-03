package com.gem;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.JedisPool;



@SpringBootTest
class JedisPoolAppTest {

    @Autowired
    public JedisPool jedisPool;

    @Test
    void contextLoads(){
        System.out.println(jedisPool);
    }
}
