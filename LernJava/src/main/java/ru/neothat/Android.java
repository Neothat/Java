package ru.neothat;

public class Android implements ParticipantActions{
    int MaximumJumpHeight = 350;
    int MaximumRunningDistance = 5000;

    @Override
    public void run(int distance) {
        System.out.printf("Робот смог пробежать %d условных едениц\n", distance);
    }
    @Override
    public void notRunning(int distance) {
        System.out.printf("Робот не смог пробежать %d условных едениц\n", distance);
    }

    @Override
    public void jump(int heist) {
        System.out.printf("Робот смог перепрыгнуть %d условных едениц\n", heist);
    }
    @Override
    public void notJump(int heist) {
        System.out.printf("Робот не смог перепрыгнуть %d условных едениц\n", heist);
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
