package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число от 0 до 15: ");
        if (in.hasNextInt()) {
            int n = in.nextInt();

            int c = 1;

            // Вариант 1
            for (int i = 1; i <= n; i++) {
                if (n > -1 & n < 16) {
                    c = c * i;

            //Вариант 2
            //int i=1;
            //while (i<=n) {
            //    if (n > -1 & n < 16) {
            //        c = c * i;
            //        i++;
                }
                else {
                    System.out.print("Ошибка ввода. Повторите попытку");
                    in.next();
                }
            }
            n = c;
            System.out.print("Факториал: " + n);

            in.close();
        }
        else {
            System.out.print("Ошибка ввода. Повторите попытку");
            in.next();
        }}}
