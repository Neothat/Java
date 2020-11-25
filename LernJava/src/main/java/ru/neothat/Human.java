package ru.neothat;

public class Human implements Action{
    int maxHeist = 150;
    int maxDistance = 1500;

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
