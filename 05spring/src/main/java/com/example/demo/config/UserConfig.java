package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.model.User;

@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User(2, "李四", 19, "北京市");
    }

}
