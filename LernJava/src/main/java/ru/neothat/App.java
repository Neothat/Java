package ru.neothat;

public class App {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Ван Гог", 20);
        cats[1] = new Cat("Лексус", 15);
        cats[2] = new Cat("Оскар", 10);
        cats[3] = new Cat("Симба", 5);
        cats[4] = new Cat("Форсаж", 2);

        Plate plate = new Plate(43);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].satietyInfo();
            plate.info();
            if (i < (cats.length - 1)) plate.increaseFood();
        }

    }
}
