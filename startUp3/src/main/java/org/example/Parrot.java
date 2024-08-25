package org.example;

public class Parrot
{
    String name = "Polly";

    public void speak()
    {
        System.out.printf("%s says: Squak! %n", name);
    }

    public void speak(String word)
    {
        System.out.printf("%s says: %s! %n", name, word);
    }
}
