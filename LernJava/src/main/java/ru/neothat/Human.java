package ru.neothat;

public class Human implements ParticipantActions{
    int MaximumJumpHeight = 100;
    int MaximumRunningDistance = 1500;

    @Override
    public void run(int distance) {
        System.out.printf("Человек смог пробежать %d условных едениц\n", distance);
    }
    @Override
    public void notRunning(int distance) {
        System.out.printf("Человек не смог пробежать %d условных едениц\n", distance);
    }

    @Override
    public void jump(int heist) {
        System.out.printf("Человек смог перепрыгнуть %d условных едениц\n", heist);
    }
    @Override
    public void notJump(int heist) {
        System.out.printf("Человек не смог перепрыгнуть %d условных едениц\n", heist);
    }

    @Override
    public int getMaximumJumpHeight() {
        return MaximumJumpHeight;
    }
    @Override
    public int getMaximumRunningDistance() {
        return MaximumRunningDistance;
    }
}
