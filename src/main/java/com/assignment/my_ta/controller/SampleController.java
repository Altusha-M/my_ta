package com.assignment.my_ta.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class SampleController {

    AmqpTemplate template;

    @Autowired
    public SampleController(AmqpTemplate template) {
        this.template = template;
    }

    @GetMapping("/{message}")
    String myQueue(@PathVariable String message) {
        System.out.println("Emit to myQueue1");
        template.convertAndSend("myQueue1", message);
        System.out.println(message);
        return "index";
    }

    @PostMapping("/{message}")
    String myQueuePost(@PathVariable String message) {
        System.out.println("Emit to myQueue1");
        template.convertAndSend("myQueue1", message);
        System.out.println(message);
        return "index";
    }

    @PutMapping("/{message}")
    String myQueuePut(@PathVariable String message) {
        System.out.println("Emit to myQueue1");
        template.convertAndSend("myQueue1", message);
        return "index";
    }

    @DeleteMapping("/{message}")
    String myQueueDelete(@PathVariable String message) {
        System.out.println("Emit to myQueue1");
        template.convertAndSend("myQueue1", message);
        return "index";
    }
}