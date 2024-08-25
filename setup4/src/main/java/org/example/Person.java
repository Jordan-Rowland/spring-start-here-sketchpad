package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("persona")
public class Person {
    String name = "Jim Halpert";
    private final Parrot pet;

    public void speak() {
        System.out.println("Yoyo!!");
    }

    public Parrot getPet() { return pet; }

    public Person(Parrot parrot) { pet = parrot; }
}
