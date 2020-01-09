package com.assignment.my_ta.controller;

import com.assignment.my_ta.POJO.Message;
import com.assignment.my_ta.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody Message messsssage) {
        this.producer.sendMessage(messsssage.toString());
//        System.out.println(message);
    }

}
