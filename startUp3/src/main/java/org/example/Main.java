package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();
        parrot.name = "Rocky";
        parrot.speak("Heeee");
        System.out.println("Hello world!");
    }
}


