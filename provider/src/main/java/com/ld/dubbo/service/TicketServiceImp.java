package com.ld.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@DubboService//可以被扫描到
@Service
public class TicketServiceImp implements TicketService {
    @Override
    public int[] sort(int[] arr) {
        //arr的地址在分布式服务中，都不一样，所以要有返回值
        Arrays.sort(arr);
        return arr;
    }

    @Override
    public String getTicket() {
        return "sold ticket------";
    }
}
