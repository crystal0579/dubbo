package com.sonia.dubboz.service.impl;

import com.sonia.dubboz.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * zookeeper 服务注册与发现
 */
@Service//表示可以被dubbo包扫描到，并在项目启动时就注册到注册中心
@Component//使用dubbo后尽量用compent替换原来的service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "ticket from provider --sonia --zookeeper";
    }
}
