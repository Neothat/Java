package ru.neothat;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    // Параметры игры
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    // Константы •, X, O, отступ
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    private static final int LINE_LIMIT = 15;

    // Игровое поле, ввод с клавиатуры, случайные числа
    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    // Основной метод

    public static void main(String[] args) {

        // Инициализация игрового поля
        initMap();

        // Вывод игрового поля
        printMap();

        // Главный игровой цикл
        while (true) {
            
            // Ход игрока
            humanTurn();

            // Вывод игрового поля
            printMap();

            // Проверка победителя
            if (checkWin(DOT_X)){
                System.out.println("Игрок одержал победу");
                break;
            }

            // Проверка на заполненомть поля
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }

            // Ход ИИ
            aiTurn();

            // Вывод игрового поля
            printMap();

            // Проверка победителя
            if (checkWin(DOT_O)){
                System.out.println("ИИ одержал победу");
                break;
            }

            // Проверка на заполненомть поля
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }

        // Игра закончена
        System.out.println("Игра завершена");
    }

    private static boolean isMapFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (map[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (checkLineColumn(i, 0, 0, 1, 0, symbol)) return true; // Проверяем столбец
            if (checkLineColumn(0, i, 1, 0, 0, symbol)) return true; // Проверяем строку
        }
        for (int i = 0; i <= SIZE-DOTS_TO_WIN; i++) { // Проверям диагонали
            if (checkLineColumn(i, 0, 1, 1, i, symbol)) return true;
            if (checkLineColumn(0, i, 1, 1, i, symbol)) return true;
            if (checkLineColumn(i, SIZE-1, 1, -1, i, symbol)) return true;
            if (checkLineColumn(0, SIZE-(1+i), 1, -1, i, symbol)) return true;
        }
        return false;
    }

    /*
    Метод принимает 6 параметров
    1-ый отвечает за номер столбца
    2-ой отвечает за номер строки
    3-ий в связке с i отвечает за передвижение в другой столбец
    4-ый в связке с i отвечает за передвижение в другую строку
    5-ый используется при проверке диагоналей и нужен что бы не вылететь за пределы массива,
    так как ближе к углам игрового поля диагоноль становиться меньше
    6-ой отвечает за то, с каким символом мы будем сравнивать
     */
    private static boolean checkLineColumn(int column, int line, int changeColumn, int changeLine, int changeDiagonal, char symbol) {
        int dots = 0;
        for (int i = 0; i < SIZE-changeDiagonal; i++) {
            if (map[line + i * changeLine][column + i * changeColumn] == symbol) {
                dots++;
            } else {
                dots = 0;
            }
            if(dots == DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private static void aiTurn() {
        int x = -1;
        int y = -1;
        boolean aiWin = false;
        boolean userWin = false;

        // Если у ИИ есть выигрышный ход то он его сделает
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!isCellValid(i, j)){
                    map[j][i] = DOT_O;
                    if (checkWin(DOT_O)){
                        x = i;
                        y = j;
                        aiWin = true;
                    }
                    map[j][i] = DOT_EMPTY;
                }
            }
        }

        /* Если у ИИ нет выигрышного хода, но следующий ход игрока может стать победным,
        то он попытается его заблокировать */
        if (!aiWin) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isCellValid(i, j)) {
                        map[j][i] = DOT_X;
                        if (checkWin(DOT_X)) {
                            x = i;
                            y = j;
                            userWin = true;
                        }
                        map[j][i] = DOT_EMPTY;
                    }

                }

            }
        }

        // Если следующий ход ИИ не выиграшный и не блокирует победу Игрока, то ИИ ходит хаотично
        if (!userWin && !aiWin) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (isCellValid(x, y));
        }
        map[y][x] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE) return true;
        if (y < 0 || y >= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }

    private static void printMap() {
        // Сделали отступ
        for (int i = 0; i < LINE_LIMIT; i++) {
            System.out.println();
        }

        // Верхняя легенда
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Нумерация строк и элементы массива
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y+1) + " " );
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }
}