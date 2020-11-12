package ru.neothat;

import java.util.Scanner;

public class EmployeesHomeWorkFive {
    // Idea предлагает все поля которые не изменяются сделать final
    private final String fullName;
    private final String position;
    private final String email;
    private final long phoneNumbers;
    private int salary;
    private final int age;

    public EmployeesHomeWorkFive(String fullName, String position, String email,
                                 long phoneNumbers, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.salary = salary;
        this.age = age;
    }

    //Допусти это супер маленькая компания по созданию инди игр,
    // и единственное поле доступное для изменения это поле с зарплатой
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumbers() {
        return phoneNumbers;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        EmployeesHomeWorkFive[] personArray = new EmployeesHomeWorkFive[5];
        personArray[0] = new EmployeesHomeWorkFive(
                "Абрамов Игорь Даниилович",
                "Программист",
                "IgorDaniilovich@gmail.com",
                89856664013L,
                2440,
                22
                );
        personArray[1] = new EmployeesHomeWorkFive(
               "Исаева София Артёмовна",
               "Композитор",
                "SofiaArtyomovna@gmail.com",
                89856662789L,
                2000,
                19
        );
        personArray[2] = new EmployeesHomeWorkFive(
                "Пугачева Таисия Михайловна",
                "Гейм-диайнер",
                "TaisiyaMikhailovna@gmail.com",
                89363334244L,
                3200,
                24
        );
        personArray[3] = new EmployeesHomeWorkFive(
                "Сорокин Руслан Антонович",
                "Художник",
                "RuslanAntonovich@gmail.com",
                89269999027L,
                2300,
                45
        );
        personArray[4] = new EmployeesHomeWorkFive(
                "Орлова Полина Романовна",
                "Продюсер",
                "PolinaRomanovna@gmail.com",
                89917621210L,
                3400,
                50
        );

        System.out.println("Сотрудники которым больше 40 лет: ");
        for (EmployeesHomeWorkFive employeesHomeWorkFive : personArray) {
            if (employeesHomeWorkFive.getAge() > 40) PrintPerson(employeesHomeWorkFive);
        }
    }

    private static void PrintPerson(EmployeesHomeWorkFive person) {
            System.out.printf("ФИО: %s\nДолжность: %s\nПочта: %s\nНомер телефона: %d\nЗарплата: %d$\nВозраст: %d",
                    person.getFullName(), person.getPosition(), person.getEmail(), person.getPhoneNumbers(),
                    person.getSalary(), person.getAge());
            System.out.println();
            System.out.println();
    }
}
