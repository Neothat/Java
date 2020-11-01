package ru.neothat;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTreeWords {

    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        Random random = new Random();
        String hiddenWord = words[random.nextInt(words.length)+1];

        Scanner in = new Scanner(System.in);

        System.out.println("Какое слово загадал компьютер?");
        while (true) {
            String userAnswer = in.nextLine();

            if (userAnswer.equals(hiddenWord)) {
                System.out.println("Это правильно!");
                break;
            }

            int length15 = 0;

            for (int i = 0; i < hiddenWord.length() && i < userAnswer.length(); i++) {
                if (userAnswer.charAt(i) == hiddenWord.charAt(i)) {
                    System.out.print(userAnswer.charAt(i));
                    length15++;
                } else {
                    System.out.print("*");
                    length15++;
                }
            }
            length15 = 15 - length15;
            while (length15 != 0) {
                System.out.print("*");
                length15--;
            }
            System.out.println();
            System.out.println("Попробуйте еще раз");
        }
    }
}
