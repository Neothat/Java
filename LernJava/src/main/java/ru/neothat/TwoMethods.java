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
        inOrder();
        Arrays.fill(arr, 1);
        divideAndRule();
    }

    private static void divideAndRule() {
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread firstHalf = new Thread(new FirstHalf());
        Thread secondHalf = new Thread(new SecondHalf());
        firstHalf.start();
        secondHalf.start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void inOrder() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }
}
