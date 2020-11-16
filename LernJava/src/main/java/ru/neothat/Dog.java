package ru.neothat;

public class Dog extends Animal{

    public Dog() {
        super(
                300 + random.nextDouble() * 301, // [300,0 .. 600,0]
                5 + random.nextDouble() * 11, // [5,0 .. 15,0]
                 0.2 + random.nextDouble() * 1.4 // [0,2 .. 1,5]
        );
    }
}
