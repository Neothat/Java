package ru.neothat;

import java.util.Scanner;

public class Plate {
    private int food;
    static Scanner sc = new Scanner(System.in);
    public Plate (int food){
        this.food = food;
    }

    public void info() {
        System.out.printf("В тарелке сейчас: %d еды\n", food);
    }

    public boolean decreaseFood(int foodDelta){
        if (this.food - foodDelta >= 0) {
            this.food -= foodDelta;
            return true;
        } else {
            return false;
        }
    }

    public void increaseFood() {

        while (true){
            System.out.println("Хотите добавить корма? y/n");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase("y")){
                System.out.println("Сколько добавить?");
                this.food += sc.nextInt();
                sc.nextLine();
                break;
            } else if(userAnswer.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
