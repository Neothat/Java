package ru.neothat.Backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private final int maxWeight;

    private int bestPrice;
    private List<Thing> bestThings = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void calcBestSet(List<Thing> things){
        if (things.isEmpty()) {
            return;
        }

        bestSet(things);

        for (int i = 0; i < things.size(); i++) {
            List<Thing> copiedThings = new ArrayList<>(things);
            copiedThings.remove(i);
            calcBestSet(copiedThings);
        }
    }

    private void bestSet(List<Thing> things) {
        int sumPrice = calcPrice(things);
        int sumWeight = calcWeight(things);
        if (sumWeight <= maxWeight &&(bestThings == null || sumPrice > bestPrice)){
            bestThings = things;
            bestPrice = sumPrice;
        }
    }

    private int calcWeight(List<Thing> things) {
        int sumWeight = 0;
        for (Thing thing : things){
            sumWeight += thing.getWeight();
        }
        return sumWeight;
    }

    private int calcPrice(List<Thing> things) {
        int sumPrice = 0;
        for (Thing thing : things){
            sumPrice += thing.getPrice();
        }
        return sumPrice;
    }

    public List<Thing> getBestSet() {
        return bestThings;
    }

    public int getBestPrice() {
        return bestPrice;
    }
}
