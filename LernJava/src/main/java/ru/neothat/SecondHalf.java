package ru.neothat;

public class SecondHalf extends TwoMethods implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
