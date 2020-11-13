package ru.neothat;

public class EmployeeInfo {
    public static void main(String[] args) {
        EmployeesHomeWorkFive[] personArray = new EmployeesHomeWorkFive[5];
        personArray[0] = new EmployeesHomeWorkFive(
                "Абрамов Игорь Даниилович",
                "Программист",
                "IgorDaniilovich@gmail.com",
                "8-985-666-40-13",
                (double) 2440,
                22,
                1
        );
        personArray[1] = new EmployeesHomeWorkFive(
                "Исаева София Артёмовна",
                "Композитор",
                "SofiaArtyomovna@gmail.com",
                "8-985-666-27-89",
                (double) 2000,
                19,
                2
        );
        personArray[2] = new EmployeesHomeWorkFive(
                "Пугачева Таисия Михайловна",
                "Гейм-диайнер",
                "TaisiyaMikhailovna@gmail.com",
                "8-936-333-42-44",
                (double) 3200,
                24,
                3
        );
        personArray[3] = new EmployeesHomeWorkFive(
                "Сорокин Руслан Антонович",
                "Художник",
                "RuslanAntonovich@gmail.com",
                "8-926-999-90-27",
                (double) 2300,
                45,
                4
        );
        personArray[4] = new EmployeesHomeWorkFive(
                "Орлова Полина Романовна",
                "Продюсер",
                "PolinaRomanovna@gmail.com",
                "8-991-762-12-10",
                (double) 3400,
                50,
                5
        );
        System.out.println("Сотрудники которым больше 40 лет: ");
        for (EmployeesHomeWorkFive employeesHomeWorkFive : personArray) {
            if (employeesHomeWorkFive.getAge() > 40) {
                employeesHomeWorkFive.PrintPerson();
            }
        }
    }
}
