package Lessons;

import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        // посчитаем длину окружности, если ее радиус считывается с клаиватуры
        Scanner sc = new Scanner(System.in);
        double d; // диаметр окружности
        double pi;
        System.out.println("Input d");
        d = sc.nextDouble();
        System.out.println("Input pi");
        pi = sc.nextDouble();
        d = 5;
        pi = 3.14;
        double circle = pi * d;
        System.out.println(circle);
        // выводит Input d. Не знаю, как эту задачку решить
    }
}
