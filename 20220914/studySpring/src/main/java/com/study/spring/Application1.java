package com.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/study/spring/application1-context.xml");

        Hello hello = context.getBean("Hello", Hello.class);
        hello.sayHello();

    }
}
