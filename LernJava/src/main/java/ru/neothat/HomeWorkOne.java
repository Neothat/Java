package ru.neothat;
//Пустой проект в Intellij IDEA Создан
public class HomeWorkOne {
    public static void main(String[] args) {

        byte by = 1;
        short sh = -32000;
        int in = 21342353;
        long lo = -2542356453L;
        float fl = 2.3435F;
        double dob = 3.14;
        char ch = 'a';
        boolean bo = true;
        String i = "GeekBrains";
        //Создание переменных всех типов данных, и их инициализация

        System.out.println(equation(3,4,10,2));
        System.out.println(equation(30,40,100,20));
        //Написан метод вычисляющий выражение a * (b + (c / d))
        System.out.println();

        System.out.println(sumOfTwo(4,5));
        System.out.println(sumOfTwo(5,9));
        //Написан метод проверяющий сумму
        System.out.println();

        System.out.println(numberCheck(0));
        System.out.println(numberCheck(-5));
        //Написан метод, который проверяет положительное ли число или нет
        System.out.println();

        System.out.println(negativeNumber(0));
        System.out.println(negativeNumber(-5));
        //Написан метод, который проверяет на отрицательность
        System.out.println();

        helloName("Гильермо");
        helloName("Альфонсо");
        //Написан метод, приветствующий пользователя
        System.out.println();

        leapYear(4);
        leapYear(8);
        leapYear(100);
        leapYear(300);
        leapYear(400);
        leapYear(800);
        //Написан метод, который определяет является ли год високосным
    }

    public static int equation(int a, int b, int c, int d) {
        return a*(b+(c/d));
    }

    public static boolean sumOfTwo (int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static String numberCheck (int a){
        if (a>=0){
            return "Введено положительное число";
        } else {
            return "Введено отрицательное число";
        }
    }

    public static boolean negativeNumber (int a){
        return a<0;
    }

    public static void helloName (String name){
        System.out.println("Привет " + name + "!");
    }

    public static void leapYear (int a){
        if (!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0)))
            System.out.println(a + "г. не високосный");
        else System.out.println(a + "г. високосный");
    }
}