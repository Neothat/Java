package ru.neothat;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            this.satiety = true;
        }
    }

    public void satietyInfo() {
        System.out.printf("У %s показатель сытости = %b. ", this.name, this.satiety);
    }

}
