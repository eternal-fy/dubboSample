package com.ld.dubbo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @DubboReference
    Hello hello;

    @Scheduled(cron = "0 0 8 * * 0-7")
    public void goodMorning(){
        hello.goodMorning();
    }

    @Scheduled(cron = "0 0 23 * * 0-7")
    public void goodNight(){
        hello.goodNight();
    }

}
