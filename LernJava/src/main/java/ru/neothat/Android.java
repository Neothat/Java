package ru.neothat;

public class Android implements Action{
    int maxHeist = 500;
    int maxDistance = 5000;

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
