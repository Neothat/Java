package ru.neothat.Backpack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList();
        things.add(new Thing("book", 1, 600));
        things.add(new Thing("binoculars", 2, 5000));
        things.add(new Thing("first aid kid", 4, 1500));
        things.add(new Thing("notebook", 2, 40000));
        things.add(new Thing("bowler hat", 1, 500));

        Backpack backpack = new Backpack(5);
        backpack.calcBestSet(things);

        for (Thing thing : backpack.getBestSet()){
            System.out.println(thing.getName() + " " + thing.getPrice());
        }

        System.out.println("Total best price is " + backpack.getBestPrice());
    }

}
