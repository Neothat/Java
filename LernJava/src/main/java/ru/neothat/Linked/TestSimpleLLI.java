package ru.neothat.Linked;

public class TestSimpleLLI {
    public static void main(String[] args) {
//        LinkedList <Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertLast(0);

        linkedList.display();

        System.out.println("Find 2 " + linkedList.contains(2));
        System.out.println("Find 3 " + linkedList.contains(3));
        System.out.println("Find 5 " + linkedList.contains(5));
        System.out.println("Find 444 " + linkedList.contains(444));

        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();
    }
}
