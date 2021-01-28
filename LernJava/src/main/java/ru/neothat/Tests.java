package ru.neothat;

public class Tests {

    @BeforeSuit
    public static void testOne() {
        System.out.println("BeforeSuit");
    }

    @Test(priority = 1)
    public static void testTwo() {
        System.out.println("Test priority 1");
    }

    @Test(priority = 10)
    public static void testThree() {
        System.out.println("Test priority 10");
    }

    @Test()
    public static void testFour() {
        System.out.println("Test priority default(5)");
    }

    @AfterSuit
    public static void testFive() {
        System.out.println("AfterSuit");
    }
}
