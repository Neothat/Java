package ru.neothat.BigTask;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box<>(apple, apple, apple);
        Box<Orange> orangeBox = new Box<>(orange, orange, orange, orange);

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Равны ли коробки между собой? " + appleBox.compare(orangeBox));

        appleBox.add(apple, apple, apple);

        System.out.println("Равны ли коробки между собой после добавления яблок? " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.transfer(newAppleBox);
        System.out.println("Вес старой коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес новой коробки с яблоками: " + newAppleBox.getWeight());

        /*Box<Orange> newOrangeBox = new Box<>();
        newAppleBox.transfer(newOrangeBox);*/ //Ошибка компиляции при попытке пересывать яблоки в коробку для апельсинов
    }
}
