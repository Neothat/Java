package ru.neothat;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkOne {

    private static final ReferenceDataBox<Integer> NUMBERS =
            new ReferenceDataBox<>(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
    private static final ReferenceDataBox<String> NAMES =
            new ReferenceDataBox<>("Abigael", "Ava", "Eileen",
                    "Aleta", "Angelina", "Beatrice",
                    "Vanessa", "Grace", "Laura", "Kiara");
    private static final ReferenceDataBox<Character> SYMBOL =
            new ReferenceDataBox<>('q', 'w', 'e', 'r', 't', 'y');


    public static void main(String[] args) {

        NUMBERS.swap(0, 6);
        NAMES.swap(4, 3);
        SYMBOL.swap(2,5);

        System.out.println(Arrays.toString(NUMBERS.getObj()));
        System.out.println(Arrays.toString(NAMES.getObj()));
        System.out.println(Arrays.toString(SYMBOL.getObj()));
    }


}
