package ru.neothat;

import java.util.Arrays;

public class TwoMethods {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];
    static float[] arr = new float[size];

    public synchronized static void main(String[] args) {
        Arrays.fill(arr, 1);
        measureTime(() -> inOrder(arr), "orderMethod");
        Arrays.fill(arr, 1);
        measureTime(() -> divideAndRule(arr), "multiMethod");
    }

    private static void inOrder(float[] data){
        inOrder(data, 0);
    }

    private static void inOrder(float[] data, int offset) {
        for (int i = 0; i < data.length; i++) {
            float currentValue = data[i];
            data[i] = computerValue(i + offset, currentValue);
        }
    }

    private static float computerValue(int index, float currentValue) {
        return (float)(currentValue * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
    }

    private static void divideAndRule(float[] data) {
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread firstHalf = new Thread(() -> inOrder(a1, 0));
        Thread secondHalf = new Thread(() -> inOrder(a2, h));
        firstHalf.start();
        secondHalf.start();

        try {
            firstHalf.join();
            secondHalf.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }

    private static void measureTime(Runnable action, String actionName) {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();
        long duration = finish - start;
        System.out.printf("Метод '%s' выполнился за %d ms %n", actionName, duration);
    }
}
