package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String greatDay;
        final int NUM;
        NUM = 25;
        String word = " I am happy ";
        greatDay = NUM + word;
        System.out.println(greatDay);


        if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }


        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.next();
        System.out.println("Привет, " + name);


    }
}
