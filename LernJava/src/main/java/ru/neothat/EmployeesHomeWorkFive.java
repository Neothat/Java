package ru.neothat;

public class EmployeesHomeWorkFive {
    // Idea предлагает все поля которые не изменяются сделать final
    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumbers;
    private Double salary;
    private final int age;
    private final int id;

    public EmployeesHomeWorkFive(String fullName, String position, String email,
                                 String phoneNumbers, Double salary, int age, int id){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.salary = salary;
        this.age = age;
        this.id = id;
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

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void PrintPerson() {
        System.out.printf("ФИО: %s\nДолжность: %s\nПочта: %s\nНомер телефона: %s\nЗарплата: %f$\nВозраст: %d \nId: %d",
                getFullName(), getPosition(), getEmail(), getPhoneNumbers(),
                getSalary(), getAge(), getId());
        System.out.println();
            System.out.println();
    }
}
