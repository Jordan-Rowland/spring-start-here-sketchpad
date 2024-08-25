package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.name);
        parrot.speak();

        var person = context.getBean(Person.class);
        System.out.println(person.name);
        person.speak();
        System.out.println(person.getPet());
    }
}

