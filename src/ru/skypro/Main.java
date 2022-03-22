package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	task12();
    task3();
    }

    public static void task12() {
        System.out.println("Задачи 1 и 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("1. ФИО сотрудника - %s %n", fullName);

        String fullNameCaps = fullName.toUpperCase(Locale.ROOT);
        System.out.printf("2. Данные ФИО сотрудника для заполнения отчета - %s %n", fullNameCaps);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace("ё", "е");
        System.out.printf("ФИО сотрудника - %s %n", fullName1);
    }
}
