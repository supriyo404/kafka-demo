package com.supriyo.procon.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisherService {

    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublisherService(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String input){
        kafkaTemplate.send("test-topic",input);
    }
}
