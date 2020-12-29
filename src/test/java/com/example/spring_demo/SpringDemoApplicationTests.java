package com.example.spring_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDemoApplicationTests {

    @Autowired
    private JdbcTemplateDemo jdbcTemplateDemo;
    @Test
    void contextLoads() {
        jdbcTemplateDemo.initDataSource();
    }

    @Test()
    void contextLoads1() {
        jdbcTemplateDemo.insertValue();
    }
}
