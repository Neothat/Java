package ru.neothat;

import java.util.Arrays;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 1){
                firstArray[i] = 0;
            } else {
                firstArray[i] = 1;
            }
        }
        System.out.println("1) " + Arrays.toString(firstArray));
        //Задание с заменой 1->0 0->1 выполнено
        System.out.println();

        int[] secondArray = new int[8];
        byte value = 0;
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = value;
            value += 3;
        }
        System.out.println("2) " + Arrays.toString(secondArray));
        //Задание с заполеннием масива +=3 выполнено
        System.out.println();

        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6){
                thirdArray[i] *= 2;
            }
        }
        System.out.println("3) " + Arrays.toString(thirdArray));
        //Задание с прохождением цикла и умножением на 2 выполнено
        System.out.println();

        int size = 6;
        int[][] fourthArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            fourthArray[i][i] = 1;
            fourthArray[i][size - i - 1] = 1;
        }
        System.out.println("4) ");
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray.length; j++) {
                System.out.print(fourthArray[i][j] + " ");
            }
            System.out.println();
        }
        //Задание с заполнением диагонали единицами выполнено
        System.out.println();

        int[] fifthArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            fifthArray[i] = (int) (Math.random() * 100);
        }
        int min = 100;
        int max = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (fifthArray[i] > max)
                max = fifthArray[i];

            if (fifthArray[i]<min)
                min = fifthArray[i];
        }
        System.out.println("5) " + Arrays.toString(fifthArray) +
                "\nМаксимальный элемент равен: " + max +
                "\nМинимальный элемент равен: " + min);
        // Задание с нахождением максимального и минимального элемента выполнено
        System.out.println();

        int[] sixthArrayOne = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("6) " + Arrays.toString(sixthArrayOne) + " " + checkBalance(sixthArrayOne));
        int[] sixthArrayTwo = {1, 1, 1, 2, 1};
        System.out.println(Arrays.toString(sixthArrayTwo) + " " + checkBalance(sixthArrayTwo));
        int[] sixArrayThree = {1, 2, 7};
        System.out.println(Arrays.toString(sixArrayThree) + " " + checkBalance(sixArrayThree));
        //Задание со сравнением левой и правой части выполнено
        System.out.println();

        int[] seventhArrayOne = {1, 2, 3, 4, 5, 6};
        int[] seventhArrayTwo = {5, 6, 7};
        System.out.println("7) " + Arrays.toString(bias(seventhArrayOne, 2)));
        System.out.println(Arrays.toString(bias(seventhArrayTwo, -5)));
        //Задание с передвижением массива выполнено
        //
    }

    public static boolean checkBalance(int[] balance){
        int leftSide = 0;
        int rightSide = 0;
        for (int i = 1; i < balance.length; i++) {
            rightSide += balance[i];
        }
        for (int i = 0; i < balance.length-1; i++) {
            leftSide += balance[i];
            if (leftSide == rightSide){
                return true;
            } else {
                rightSide -= balance[i + 1] ;
            }
        }
        return false;
    }

    public static int[] bias(int[] array, int n){
        int temp = 0;
        if (n>0) {
            while (n != 0) {
                temp = array[0];
                array[0] = array[array.length - 1];
                for (int i = 1; i < array.length - 1; i++) {
                    array[array.length - i] = array[array.length - i - 1];
                }
                array[1] = temp;
                n--;
            }
            return array;
        } else {
            while (n != 0) {
                temp = array[array.length-1];
                array[array.length-1] = array[0];
                for (int i = 0; i < array.length - 2; i++) {
                    array[i] = array[i+1];
                }
                array[array.length-2] = temp;
                n++;
            }
            return array;
        }
    }
}
