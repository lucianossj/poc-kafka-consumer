package com.study.ljit.poc_kafka_consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topics.hello.request.topic", groupId = "group")
    public void consumer(String message, String name) {
        System.out.println(message);
    }

}
