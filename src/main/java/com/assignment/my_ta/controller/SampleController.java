package com.assignment.my_ta.controller;

import com.assignment.my_ta.POJO.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Message> myQueuePost(@RequestBody List<Message> msgs) {

        System.out.println("Emit to myQueue1");
//        template.convertAndSend("myQueue1", "1");
        System.out.println(msgs.toString());
        return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
    }

}