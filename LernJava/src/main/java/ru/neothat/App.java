package ru.neothat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {

    //Создание кнопок и текстового поля
    JButton topMassage = new JButton();
    JButton bottomMassage = new JButton();
    JTextField text = new JTextField();

    public App() {
        // Название, размер и позиция
        setTitle("First App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400); // Размер и позиция

        //Создание кнопки задания и размещение на севере
        topMassage.setText("Введите арабское число от 1 до 3999");
        //При нажатии на кнопку будет меняться цвет текстового поля  ¯\_(ツ)_/¯
        topMassage.addActionListener(e -> {
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R, G, B);
            text.setBackground(randomColor);
        });
        add(topMassage, BorderLayout.NORTH);

        //Размещение кнопки результатана юге
        bottomMassage.setText(" ");
        add(bottomMassage, BorderLayout.SOUTH);

        //Создание текстового поля и размещение по середине;
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Будем переводить арабские цифры в римские
                int number = Integer.parseInt(text.getText());
                // Услови написано не совсем корректно,
                // так как тасуя правильный и непраивльный ввод (3, 34, 345, 3456, 3456р, 343)
                // в кнопке вывода больше не выдаст ошибку
                // как исправить не знаю
                if (number > 0 && number < 4000) {
                    // Очень приметивный, но легко читаемый алгорит перевода чисел
                    String s = "";
                    while (number >= 1000) {
                        s += "M";
                        number -= 1000;
                    }
                    while (number >= 900) {
                        s += "CM";
                        number -= 900;
                    }
                    while (number >= 500) {
                        s += "D";
                        number -= 500;
                    }
                    while (number >= 400) {
                        s += "CD";
                        number -= 400;
                    }
                    while (number >= 100) {
                        s += "C";
                        number -= 100;
                    }
                    while (number >= 90) {
                        s += "XC";
                        number -= 90;
                    }
                    while (number >= 50) {
                        s += "L";
                        number -= 50;
                    }
                    while (number >= 40) {
                        s += "XL";
                        number -= 40;
                    }
                    while (number >= 10) {
                        s += "X";
                        number -= 10;
                    }
                    while (number >= 9) {
                        s += "IX";
                        number -= 9;
                    }
                    while (number >= 5) {
                        s += "V";
                        number -= 5;
                    }
                    while (number >= 4) {
                        s += "IV";
                        number -= 4;
                    }
                    while (number >= 1) {
                        s += "I";
                        number -= 1;
                    }
                    bottomMassage.setText(s);
                } else {
                    bottomMassage.setText("Error");
                }
            }
        });
        add(text, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
