package ru.neothat.BigTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private final ArrayList<T> boxWithFruits;

    @SafeVarargs
    public Box(T... fruits) {
        this.boxWithFruits = new ArrayList<>(Arrays.asList(fruits));
    }

    @SafeVarargs
    public final void add(T... fruits) {
        this.boxWithFruits.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0;
        if (boxWithFruits.size() == 0) {
            return weight;
        } else {
            for (T boxWithFruit : boxWithFruits) {
                weight += boxWithFruit.getWeight();
            }
        }
        return weight;
    }

    public boolean compare(Box <? extends Fruit> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> box) {
        box.boxWithFruits.addAll(this.boxWithFruits);
        this.boxWithFruits.clear();
    }
}