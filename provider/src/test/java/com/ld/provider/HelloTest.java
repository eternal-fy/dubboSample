package com.ld.provider;

import com.ld.dubbo.service.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;
import java.io.IOException;

@SpringBootTest
public class HelloTest {
    @Autowired
    Hello hello;

    @Test
    public  void hello() throws IOException, MessagingException {
        hello.goodNight();
    }
}
