package ru.neothat;

import ru.neothat.Stack.IStack;
import ru.neothat.Stack.StackImpl;

public class Revers<E> {
    public static void main(String[] args) {
        testStack();
    }

    private static boolean addToStack(IStack<String> stack, String value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }

    public static void testStack(){
        String str = "qwerty";
        IStack<Character> stack = new StackImpl<>(str.length());

            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

}
