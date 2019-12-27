package com.assignment.my_ta;

import com.assignment.my_ta.configuration.RabbitMQConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class MyTaApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyTaApplication.class, args);
    }
}