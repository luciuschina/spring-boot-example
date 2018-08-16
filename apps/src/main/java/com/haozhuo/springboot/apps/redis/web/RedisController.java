package com.haozhuo.springboot.apps.redis.web;


import com.haozhuo.springboot.apps.redis.model.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lucius on 8/13/18.
 */
@RequestMapping(value = "/redis")
@RestController
public class RedisController {

    @Autowired
    @Qualifier("redisTemplate0")
    private StringRedisTemplate redisDB0;

    @Autowired
    @Qualifier("redisTemplate1")
    private StringRedisTemplate redisDB1;

    @GetMapping("/get_value_from_db0")
    public String getValueFromDB0(@RequestParam(value = "key") String key) {
        return redisDB0.opsForValue().get(key);
    }

    @PostMapping("/set_value_to_db0")
    public String setValueToDB0(@RequestBody Params params) {
        String key = params.getKey();
        String value = params.getValue();
        redisDB0.opsForValue().set(key, value);
        return key + "->" + redisDB0.opsForValue().get(key);
    }

        @GetMapping("/get_value_from_db1")
    public String getValueFromDB1(@RequestParam(value = "key") String key) {
        return redisDB1.opsForValue().get(key);
    }

    @PostMapping("/set_value_to_db1")
    public String setValueToDB1(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        redisDB1.opsForValue().set(key, value);
        return  key + "->" + redisDB1.opsForValue().get(key);
    }
}
