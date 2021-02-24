package ru.neothat.Backpack;

import java.util.Objects;

public class Thing {

    private final String name;
    private final int weight;
    private final int price;

    public Thing(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        return weight == thing.weight &&
                price == thing.price &&
                Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
