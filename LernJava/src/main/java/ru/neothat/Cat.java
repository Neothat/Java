package ru.neothat;

public class Cat implements ParticipantActions{
    int MaximumJumpHeight = 200;
    int MaximumRunningDistance = 800;

    @Override
    public void run(int distance) {
        System.out.printf("Кот смог пробежать %d условных едениц\n", distance);
    }
    @Override
    public void notRunning(int distance) {
        System.out.printf("Кот не смог пробежать %d условных едениц\n", distance);
    }

    @Override
    public void jump(int heist) {
        System.out.printf("Кот смог перепрыгнуть %d условных едениц\n", heist);
    }
    @Override
    public void notJump(int heist) {
        System.out.printf("Кот не смог перепрыгнуть %d условных едениц\n", heist);
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
