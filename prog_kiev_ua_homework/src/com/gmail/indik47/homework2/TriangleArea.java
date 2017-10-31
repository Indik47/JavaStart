package com.gmail.indik47.homework2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 2;
        double b = 4;
        double c = 5;

        /*double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));*/

       /* System.out.println("enter a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        while ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Triangle doesn`t exist. Re-enter a, b, c :");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();*/
        for (int i = 0; i < 1; ) {  //пока i = 0 - цикл бесконечный; когда i = 1 - выходим из цикла и считаем площадь тр.
            System.out.println("Введи стороны треугольника a, b, c: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if ((a + b < c) || (a + c < b) || (b + c < a)) {  // если условие if выполняется, мы не меняем i и цикл идет по кругу
                System.out.println("Треугольник не существует! Введи стороны еще раз:");
            } else {
                i = 1; // если условие if НЕ выполняется(то бишь треугольник существует), i = 1 и выходим из цикла
            }
        }

        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника = " + square);
    }
}
