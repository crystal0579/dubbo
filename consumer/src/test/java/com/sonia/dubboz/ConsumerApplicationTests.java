package com.sonia.dubboz;

import com.sonia.dubboz.service.DubboService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

    @Autowired
    private DubboService dubboService;

    @Test
    void contextLoads() {
        dubboService.buyTicket();
    }

}
