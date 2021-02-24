package ru.neothat;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exp(2, 3));
        System.out.println(exp(3, 3));
        System.out.println(exp(3, 0));
        System.out.println(exp(0, 3));
        System.out.println(exp(3, -3));
        //System.out.println(exp(-2, 3));
        //System.out.println(exp(3, -3));
    }

    private static double exp(int basis, int degree) {
        if (basis == 0){
            if (degree > 0){
                return 0;
            }
            else {
                throw new IllegalArgumentException("Invalid value");
            }
        }

        if (degree < 0){
            return 1/(basis * exp(basis, -degree - 1));
        } else if (degree > 0){
            return exp(basis, degree - 1) * basis;
        } else {
            return 1;
        }

    }

}
