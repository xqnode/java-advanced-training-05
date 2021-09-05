package com.example.demo;

import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTest {

    @Test
    public void test() {
        //  1. 通过xml配置bean
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);

        System.out.println("----------------------------");

        // 2. 通过注解 @Configuration + @Bean
        ApplicationContext ac1 = new AnnotationConfigApplicationContext("com.example.demo.config");
        User user1 = ac1.getBean(User.class);
        System.out.println(user1);

        System.out.println("----------------------------");

        // 3. 通过@Component,@Service,@Controller,@Repository注解
        ApplicationContext ac2 = new AnnotationConfigApplicationContext("com.example.demo.model");
        User user2 = ac2.getBean(User.class);
        user2.setName("王二");
        System.out.println(user2);
    }
}
