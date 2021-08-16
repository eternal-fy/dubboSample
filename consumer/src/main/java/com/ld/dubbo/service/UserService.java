package com.ld.dubbo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.Ticket;
@Service
public class UserService {

    @DubboReference
    TicketService ticketService;//调用ticketService,接口包名一定要一致

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }

    public int[] sort(int[] arr) {
        int[] sort = ticketService.sort(arr);
        return sort;
    }
}
