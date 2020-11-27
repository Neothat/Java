package ru.neothat;

public interface ParticipantActions {
    void jump(int heist);
    void notJump(int heist);

    void run(int distance);
    void notRunning(int distance);

    int getMaximumJumpHeight();
    int getMaximumRunningDistance();
}
