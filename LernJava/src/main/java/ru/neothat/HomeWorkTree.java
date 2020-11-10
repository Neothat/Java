package ru.neothat;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTree {

    /*public static int userAnswer;
    public static Scanner in = new Scanner(System.in);
    public static int tryCount = 3;

    public static void main(String[] args) {
        while (true) {
            int attempt = tryCount;

            Random random = new Random();
            int answer = random.nextInt(10);

            System.out.println("Добро пожаловать в игру угадайка!");
            conclusion("Угадай число от 0 до 9 \nПри вводе числа, выходящего за данные пределы, " +
                    "вам будет защитываться поражение", attempt);

            while (attempt != 0 && userAnswer >= 0 && userAnswer <= 9) {
                attempt--;
                if (userAnswer == answer) {
                    System.out.println("Победа!");
                    break;
                } else if (attempt == 0)
                    break;
                else if (userAnswer < answer)
                    conclusion("Вы ввели слишком маленькое число " +
                            "\nПопбробуйте еще раз", attempt);
                else
                    conclusion("Вы ввели слишком большое число" +
                            "\nПопбробуйте еще раз", attempt);
            }

            if (userAnswer != answer){
                System.out.println("Вы проиграли! правельный ответ: " + answer);
            }
            System.out.println("Хотите сыграть еще раз? y/n");
            String rerun = in.nextLine();
            if (rerun.equals("n"))
                break;
        }
    }

    public static void conclusion (String write, int attempt){

        System.out.printf("%s \nУ вас осталось %d попытки", write, attempt);
        System.out.println();

        userAnswer = in.nextInt();
        in.nextLine();
    }*/

    public static int userAnswer;
    public static Scanner in = new Scanner(System.in);
    private static int answer;

    public static void main(String[] args) {
        do {
            int tryCount = 3;

            Random random = new Random();
            answer = random.nextInt(10);

            System.out.println("Добро пожаловать в игру угадайка!" +
                    "\nПопробуйте угадать число от 0 до 9 за 3 хода");
            for (; tryCount > 0; tryCount--) {
                do {
                    System.out.println("Введите число от 0 до 9. У вас осталось " + tryCount +" попытка(ки)");
                    userAnswer = in.nextInt();
                    in.nextLine();
                }while (userAnswerValid(userAnswer));

                if (userAnswer == answer){
                    System.out.println("Вы победили!");
                    break;
                }
                checkLessMore(userAnswer);
            }
            System.out.println("Вы проиграли. Правильный ответ: " + answer);
        }while (restart());

    }

    private static boolean restart() {
        while (true){
            System.out.println("Хотите попробывать еще раз? y/n");
            String rerun = in.nextLine();
            if (rerun.equals("y")) return true;
            if (rerun.equals("n")) return false;
        }
    }

    private static void checkLessMore(int userAnswer) {
        if (userAnswer > answer){
            System.out.println("Вы ввели слишком большое число");
        } else {
            System.out.println("Вы ввели слишком маленькое число");
        }
    }

    private static boolean userAnswerValid(int userAnswer) {
        return userAnswer < 0 || userAnswer > 9;
    }


}

