package com.assignment.my_ta.controller;

import com.assignment.my_ta.POJO.MyMessage;
import com.assignment.my_ta.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final Producer producer;

    @Autowired
    SampleController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping
    public void sendMessageToKafkaTopic(@RequestBody MyMessage message) {
        this.producer.sendMessage(message.getMessageText());
        System.out.println(message.toString());
    }

}
