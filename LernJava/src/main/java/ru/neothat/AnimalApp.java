package ru.neothat;

import java.util.Random;
import java.util.Scanner;

public class AnimalApp {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Сколько котов и собак будет прохоить исытание?");
        int numberOfAnimals = scanner.nextInt(); //Спрашиваем у пользователя сколько он хочет увидеть разных котов и собак
        Animal[] cats = new Cat[numberOfAnimals];
        Animal[] dogs = new Dog[numberOfAnimals];
        for (int i = 0; i < numberOfAnimals; i++) {
            cats[i] = new Cat();
            dogs[i] = new Dog();
        } // Создали массивы кошек и собак и заполнили их

        double run = random.nextDouble() * 700;
        double swim = random.nextDouble() * 20;
        double jump = random.nextDouble() * 5;
        // Случайное испытание

        for (int i = 0; i < numberOfAnimals; i++) {
            System.out.println("Характеристика кота № " + (i+1));
            cats[i].info();
            System.out.println();
            System.out.println("Характеристика собаки № " + (i+1));
            dogs[i].info();
            // Для удобства проверки задания покажем максимальные характеристики животных
            System.out.println();
            System.out.println();
            System.out.printf(
                    "Испытание заключается в том что нужно пробежать: %.1f " +
                            "проплыть: %.1f" +
                            " и перепрыгнуть препятствие высотой: %.1f", run, swim, jump
            );
            // Печатаем условия испытания
            System.out.println();
            cats[i].check("Кот", (i+1), run, swim, jump);
            System.out.println();
            dogs[i].check("Собака", (i+1), run, swim, jump);
            // Деелаем проверку
            System.out.println();
            System.out.println();
        }
    }
}
