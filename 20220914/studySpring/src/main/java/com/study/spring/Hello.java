package com.study.spring;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private Person person;
    public void setPerson(Person person) {
        this.person = person;
    }

    public void sayHello() {
        System.out.printf("Hello\n", (person != null ? person.getName() : ""));
    }
}
