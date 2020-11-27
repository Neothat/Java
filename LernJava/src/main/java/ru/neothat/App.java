package ru.neothat;

public class App {

    public static void main(String[] args) {

        Obstacle[] obstacleCourse = new Obstacle[5];
        obstacleCourse[0] = new Treadmill(600);
        obstacleCourse[1] = new Wall(80);
        obstacleCourse[2] = new Treadmill(1000);
        obstacleCourse[3] = new Wall(130);
        obstacleCourse[4] = new Treadmill(2000);

        ParticipantActions[] participants = new ParticipantActions[3];
        participants[0] = new Human();
        participants[1] = new Cat();
        participants[2] = new Android();

        for (ParticipantActions participant : participants) {
            boolean successfulRace = true;
            for (Obstacle obstacle : obstacleCourse) {
                successfulRace = obstacle.comparisonOfObstaclesAndOpportunitiesOfParticipants(participant);
                if (!successfulRace) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
