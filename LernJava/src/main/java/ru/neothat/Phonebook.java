package ru.neothat;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    public static HashMap <String, ArrayList<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {

        add("Поликарпов", "8 910 456 78 90");
        add("Злобин", "8 964 123 77 99");
        add("Гуров", "8 964 123 77 99");
        add("Иванов", "8 999 111 22 33");
        add("Поликарпов", "8 915 151 51 51");
        add("Гуров", "8 918 345 74 84");

        get("Поликарпов");
        get("Злобин");
        get("Гуров");
        get("Иванов");
    }

    private static void add(String surname, String phoneNumber) {
        ArrayList<String> phoneNumbersList = phoneBook.get(surname);
        if (phoneNumbersList == null) phoneNumbersList = new ArrayList<>();
        phoneNumbersList.add(phoneNumber);
        phoneBook.put(surname, phoneNumbersList);
    }

    private static void get (String surname){
        System.out.println(phoneBook.get(surname));
    }
}
