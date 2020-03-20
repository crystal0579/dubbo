package com.sonia.dubboz.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class DubboService {

    @Reference//因为ticketService是dubbo里面的注入，所以不能用@Autowired,但Reference 相当于spring的 Autowired
    private TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到ticket====" + ticket);
    }

}
