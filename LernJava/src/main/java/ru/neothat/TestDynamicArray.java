package ru.neothat;

import java.util.ArrayList;

public class TestDynamicArray {
    private static final int CAPACITY = 100_000;
    private static final int MAX_VALUE = 10_000;

    public static void main(String[] args) {
        Array<Integer> data = new ArrayImpl<>(CAPACITY);
        Array<Integer> dataTwo = new ArrayImpl<>(CAPACITY);
        Array<Integer> dataThree = new ArrayImpl<>(CAPACITY);

        /*Array<Integer> data = new SortedArrayImpl<>(CAPACITY);
        Array<Integer> dataTwo = new SortedArrayImpl<>(CAPACITY);
        Array<Integer> dataThree = new SortedArrayImpl<>(CAPACITY);*/
        
        for (int i = 0; i < CAPACITY; i++) {
            int newNumber = (int) (Math.random() * MAX_VALUE);
            data.add(newNumber);
            dataTwo.add(newNumber);
            dataThree.add(newNumber);
        }

        long startOne = System.nanoTime();
        data.sortBubble();
        long finishOne = System.nanoTime() - startOne;

        long startTwo = System.nanoTime();
        dataTwo.sortSelect();
        long finishTwo = System.nanoTime() - startTwo;

        long startThree = System.nanoTime();
        dataThree.sortInsert();
        long finishThree = System.nanoTime() - startThree;

        System.out.println("Пузырек: " + finishOne);
        System.out.println("Выборка: " + finishTwo);
        System.out.println("Вставка: " + finishThree);


/*      data.remove(Integer.valueOf(3));
        data.remove(2);
        data.display();

        System.out.println("data[1] = " + data.get(1));
        System.out.println("Find 2: " + data.contains(2));
        System.out.println("Find 2: " + data.contains(211));*/
    }
}
