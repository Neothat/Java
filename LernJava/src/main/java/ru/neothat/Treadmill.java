package ru.neothat;

public class Treadmill implements Obstacle{
    final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean comparisonOfObstaclesAndOpportunitiesOfParticipants(ParticipantActions participant) {
        if (distance < participant.getMaximumRunningDistance()){
            participant.run(this.distance);
            return true;
        } else {
            participant.notRunning(this.distance);
            return false;
        }
    }
}
