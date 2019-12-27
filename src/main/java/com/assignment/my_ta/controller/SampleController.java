package com.assignment.my_ta.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
//    Logger logger = Logger.getLogger(SampleController.class);

    @Autowired
    AmqpTemplate template;

    @RequestMapping("/emit/{message}")
    @ResponseBody
    String myQueue(@PathVariable String message) {
//        logger.info("Emit to queue1");
        System.out.println("Emit to myQueue1");
        template.convertAndSend("myQueue1", message);
        return "Emit to queue";
    }
}