package ru.neothat.Iter;

import ru.neothat.Linked.LinkedList;
import ru.neothat.Linked.SimpleLinkedListImpl;

public class TestIter {

    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl<>();
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);

        displayAll(list);

        System.out.println("-----------");

        ListIterator<Integer> iterator = (ListIterator<Integer>) list.iterator();
        iterator.reset();
        iterator.insertAfter(0);
        iterator.next();
        iterator.remove();
        iterator.insertBefore(0);

        displayAll(list);
        System.out.println("-----------");

        iterator = (ListIterator<Integer>) list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            displayAll(list);
            System.out.println("-----------");
        }

    }

    private static void displayAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}