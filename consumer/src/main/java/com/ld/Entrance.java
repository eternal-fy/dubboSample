package com.ld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Entrance {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Entrance.class);
    }
}
