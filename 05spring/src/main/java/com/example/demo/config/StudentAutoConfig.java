package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.properties.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties(StudentProperties.class)
@ConditionalOnProperty(prefix = "student", value = "enable", havingValue = "true")
@ConditionalOnClass(Student.class)
public class StudentAutoConfig {

    @Autowired
    private StudentProperties studentProperties;

    @Bean
    public Student student() {
        Student student = new Student(studentProperties.getId(), studentProperties.getName());
        return student;
    }
}
