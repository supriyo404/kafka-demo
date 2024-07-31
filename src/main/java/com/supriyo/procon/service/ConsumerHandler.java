package com.supriyo.procon.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerHandler {

    @KafkaListener(topics = "test-topic", groupId = "natokasi")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
