package com.supriyo.procon;

import com.supriyo.procon.service.KafkaPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/message")
public class PublisherController {

    @Autowired
    private KafkaPublisherService kafkaPublisherService;

    @PostMapping("/send")
    public String postMessage(@RequestParam(name = "msg",required = true) String message ){
        kafkaPublisherService.sendMessage(message);
        return "Message sent";
    }
}
