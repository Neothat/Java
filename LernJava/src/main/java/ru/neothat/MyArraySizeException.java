package ru.neothat;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Массив не соответствует матрице 4x4");
    }
}
