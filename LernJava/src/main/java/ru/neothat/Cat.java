package ru.neothat;

public class Cat extends Animal{

    public Cat() {
        super(
                100 + random.nextDouble() * 201, // [100,0 .. 300,0]
                0, // Коты не могу плыть :'(
                1 + random.nextDouble() * 3 // [1,0 .. 3,0]
        );
    }
}
