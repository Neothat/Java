package ru.neothat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ASatOfWords {
    public static void main(String[] args) {
        List<String> colorsList = new LinkedList<>();
        colorsList.add("Белый");
        colorsList.add("Синий");
        colorsList.add("Зеленый");
        colorsList.add("Красный");
        colorsList.add("Черный");
        colorsList.add("Бежевый");
        colorsList.add("Серебряный");
        colorsList.add("Голубой");
        colorsList.add("Фиолетовый");
        colorsList.add("Желтый");
        colorsList.add("Коричневый");
        colorsList.add("Белый");
        colorsList.add("Синий");
        colorsList.add("Зеленый");
        colorsList.add("Красный");
        colorsList.add("Черный");
        colorsList.add("Белый");
        colorsList.add("Синий");
        colorsList.add("Зеленый");
        colorsList.add("Белый");

        System.out.println("Все элементы без повторения");
        HashSet<String> colorsWithoutRepetitions = new HashSet<>(colorsList);
        System.out.println(colorsWithoutRepetitions);
        System.out.println();

        System.out.println("Сколько раз появляется тот или иной элемент");
        HashMap<String, Integer> repetitions = new HashMap<>();
        for (String s : colorsList) {
            Integer frequency = repetitions.get(s);
            repetitions.put(s, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(repetitions);
    }
}
