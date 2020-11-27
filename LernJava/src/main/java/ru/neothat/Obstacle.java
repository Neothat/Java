package ru.neothat;

public interface Obstacle {
    default boolean comparisonOfObstaclesAndOpportunitiesOfParticipants(ParticipantActions participant){
        return false;
    }
}
