package org.example;

import org.springframework.stereotype.Component;

@Component("polly")
public class Parrot {
    String name = "polly";

//    public void setName(String name) {
//        this.name = name;
//    }

    public void speak() {
        System.out.println("Squak!");
    }

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot() {}

    @Override
    public String toString() {
        return "Parrot: " + name;
    }

//    @PostConstruct
//    public void postConstruct() {
//        this.name = "Bilko";
//    }
}