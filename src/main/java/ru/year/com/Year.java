package ru.year.com;

import java.util.Scanner;

public class Year {

        public static void main(String[] args) {

            System.out.println("Введите год в формате 2004");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();

            if ((year % 4 == 0) || (year % 400 == 0) || (year % 100 == 0)) {
                System.out.println("Количество дней 366,год  високосный");

            } else {
                System.out.println("Количество дней 365, Год не високосный");


            }
        }
    }

