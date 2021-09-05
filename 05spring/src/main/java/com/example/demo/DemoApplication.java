package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements InitializingBean {
    @Autowired
    Student student;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(student);
    }
}
