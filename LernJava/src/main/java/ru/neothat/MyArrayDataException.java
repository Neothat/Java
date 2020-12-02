package ru.neothat;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String[][] element, int row, int column){
        super(String.format("В ячейке [%d][%d] находится значение %s", row, column, element[row][column]));
    }
}
