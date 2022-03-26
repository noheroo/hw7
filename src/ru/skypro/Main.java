package ru.skypro;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	task12();
    task3();
    task5();
    task6();
    task7();
    task8();
    otherTask();
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

    public static void task5() {
        System.out.println("Задача 5");
        String fullName = "Ivanov Ivan Ivanovich";
        int index1 = fullName.indexOf(" ");
        int index2 = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(0,index1);
        String firstName = fullName.substring(index1 + 1,index2);
        String middleName = fullName.substring(index2 + 1);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

    public static void task6(){
        System.out.println("Задача 6");
        String fullName = "ivanov ivan ivanovich";
        int index1 = fullName.indexOf(" ");
        int index2 = fullName.indexOf(" ",index1+1);
        char [] arr = fullName.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        arr[index1+1] = Character.toUpperCase(arr[index1+1]);
        arr[index2+1] = Character.toUpperCase(arr[index2+1]);
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        System.out.println(arr);

        StringBuilder finishString = new StringBuilder();
        for (char c : arr) {
            finishString.append(c);
        }
        System.out.printf("Верное написание Ф. И. О. сотрудника с заглавных букв — %s %n",finishString);
    }

    public static void task7() {
        System.out.println("Задача 7");
        String s1 = "135";
        String s2 = "246";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < arr1.length ; i++) {
            s3.append(arr1[i]);
            s3.append(arr2[i]);
        }
        System.out.println(s3);
    }

    public static void task8() {
        System.out.println("Задача 8");
        String s1 = "aabccddefgghiijjkk";
        System.out.print("Дублируются: ");
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i]);
            }
        }
    }

    public static void otherTask(){
        System.out.printf("%n %nЕщё одна задача %n");
        String s = "Jane is often told to give presentations in English.";
        String[] tokens = s.split(" ");
        System.out.println("Количество токенов " + tokens.length + ". Токены:");
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

