package com.assignment.my_ta.controller;

import com.assignment.my_ta.POJO.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.io.PushbackInputStream;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SampleController {

    AmqpTemplate template;

    @Autowired
    public SampleController(AmqpTemplate template) {
        this.template = template;
    }

    @PostMapping
    public Message myQueuePost(@RequestBody Message msg) {
        System.out.println("Emit to myQueue1");
//        template.convertAndSend("myQueue1", "1");
        System.out.println(msg.toString());
        return new Message("1");
    }

}