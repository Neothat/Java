package ru.neothat;

public class ABC {
    static final Object monitor = new Object();
    static volatile String letter = "A";
    final static int NUMBER_OF_REPETITIONS = 5;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < NUMBER_OF_REPETITIONS; i++) {
                synchronized (monitor) {
                    while (!letter.equals("A")){
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(letter);
                    letter = "B";
                    monitor.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < NUMBER_OF_REPETITIONS; i++) {
                synchronized (monitor) {
                    while (!letter.equals("B")){
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(letter);
                    letter = "C";
                    monitor.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < NUMBER_OF_REPETITIONS; i++) {
                synchronized (monitor) {
                    while (!letter.equals("C")){
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(letter + " ");
                    letter = "A";
                    monitor.notifyAll();
                }
            }
        }).start();
    }
}