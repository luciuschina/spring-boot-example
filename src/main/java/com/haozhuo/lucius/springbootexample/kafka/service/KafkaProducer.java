package com.haozhuo.lucius.springbootexample.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Lucius on 8/14/18.
 */
@Service
public class KafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value("${myapp.kafka.topic.user}")
    private String userTopic;

    public void sendMsgToUser(String message) {
        logger.info("sending message='{}' to topic='{}'", message, userTopic);
        kafkaTemplate.send(userTopic, message);
    }
}
