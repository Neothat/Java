package ru.neothat;

public class App {

    private static final int MAX_SIZE_ARRAY = 4;

    public static void main(String[] args) {
        String[][] stringArray  = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
//        String[][] stringArray  = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"l", "2", "3", "4"}, {"1", "2", "3", "4"}};
//        String[][] stringArray  = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3"}, {"1", "2", "3", "4"}};
        try {
            int sum = sumTheArrayElements(stringArray);
            System.out.println("Сумма массива " + sum);
        }catch (MyArraySizeException e){
            System.err.println("Массив не соответствует размеру 4х4");
            e.printStackTrace();
        }catch (MyArrayDataException e){
            System.err.println("В ячейке лежит символ или текст вместо числа");
            e.printStackTrace();
        }
    }

    private static int sumTheArrayElements(String[][] stringArray) throws MyArrayDataException, MyArraySizeException{
        checkArraySize(stringArray);

        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(stringArray, i, j);
                }
            }
        }

        return sum;
    }

    private static void checkArraySize(String[][] verifiable){
        if (verifiable.length != MAX_SIZE_ARRAY ) throw new MyArraySizeException();
        for (String[] strings : verifiable) {
            if (strings.length != MAX_SIZE_ARRAY) throw new MyArraySizeException();
        }
    }
}