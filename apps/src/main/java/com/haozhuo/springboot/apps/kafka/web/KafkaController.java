package com.haozhuo.springboot.apps.kafka.web;

import com.haozhuo.springboot.apps.kafka.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lucius on 8/14/18.
 */
@RequestMapping(value = "/kafka")
@RestController
public class KafkaController {
    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/send")
    public String sendUserIdToKafka(@RequestParam(value = "user_id") Long userId) {
        String msg = String.format("userId:%d", userId);
        kafkaProducer.sendMsgToUser(msg);
        return msg;
    }
}
