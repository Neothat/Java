package ru.neothat;

public class Cat implements Action{
    int maxHeist = 350;
    int maxDistance = 800;

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
}
