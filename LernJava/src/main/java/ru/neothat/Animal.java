package ru.neothat;

import java.util.Random;

public abstract class Animal {

    static Random random = new Random();

    protected double runLimit;
    protected double swimLimit;
    protected double jumpLimit;

    public Animal(double runLimit, double swimLimit, double jumpLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void info() {
        System.out.printf(
                "Максимальное расстояние на суше: %.1f м. " +
                        "Максимальное расстояние в воде: %.1f м. " +
                        "Максимальная высота прыжка %.1f м", runLimit, swimLimit, jumpLimit);
    }

    public void check(String type, int number, double run, double swim, double jump) {
        if (run <= runLimit) {
            System.out.printf("\n%s №%d пробежал(а) расстояние в %.1f м.", type, number, run);
        } else {
            System.out.printf("\n%s №%d не смог(ла) пробежать расстояние в %.1f м.", type, number, run);
        }
        if (swim <= swimLimit) {
            System.out.printf("\n%s №%d проплыл(а) расстояние в %.1f м.", type, number, swim);
        } else {
            System.out.printf("\n%s №%d не смог(ла) проплылть расстояние в %.1f м.", type, number, swim);
        }
        if (jump <= jumpLimit) {
            System.out.printf("\n%s №%d перепрыгнул(а) препядствие высотой в %.1f м.", type, number, jump);
        } else {
            System.out.printf("\n%s №%d не смог(ла) перепрыгнуть препядствие высотой в %.1f м.", type, number, jump);
        }
    }
    // Можно было бы создать абстрактный метод, но тогда было бы 2 почти одинаковых метода в Cat и Dog,
    // так что я решил поступить так
}
