package ru.neothat.Deque;

public class Test {

    public static void main(String[] args) {
        IDeque<String> deq = new DequeImpl<>(6);

        insertRight(deq, "q");
        insertRight(deq, "w");
        insertRight(deq, "e");
        insertRight(deq, "r");// q w e r
        insertLeft(deq, "t"); // t q w e r
        insertLeft(deq, "y"); // y t q w e r

        removeLeft(deq); // t q w e r
        removeRight(deq); // t q w e

        displayLeftToRight(deq); // Queue
//        displayRightToLeft(deq); //Stack
    }

    private static <E> void insertRight(IDeque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(IDeque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(IDeque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(IDeque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(IDeque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(IDeque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
