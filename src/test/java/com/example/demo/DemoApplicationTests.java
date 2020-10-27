package com.example.demo;

import com.example.service.demo.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DemoService demoService;
    @Test
    void contextLoads() {
        List<String> list = demoService.listString();
        System.out.println(list);

    }
}
