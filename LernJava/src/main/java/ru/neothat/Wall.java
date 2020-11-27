package ru.neothat;

public class Wall implements Obstacle{
    final int heist;

    public Wall(int heist) {
        this.heist = heist;
    }

    @Override
    public boolean comparisonOfObstaclesAndOpportunitiesOfParticipants(ParticipantActions participant) {
        if (heist < participant.getMaximumJumpHeight()){
            participant.jump(this.heist);
            return true;
        } else {
            participant.notJump(this.heist);
            return false;
        }
    }
}
