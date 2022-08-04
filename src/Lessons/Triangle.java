package Lessons;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideA;
        int sideB;
        int sideC;
        System.out.println("Input sideA");
        sideA = sc.nextInt();
        System.out.println("Input sideB");
        sideB = sc.nextInt();
        System.out.println("Input sideC");
        sideC = sc.nextInt();
        if(sideA+sideB > sideC || sideA+sideC > sideB || sideC+sideB > sideA) {
            System.out.println("This triangle exists");
        } else {
            System.out.println("This triangle doesn't exist");
        }
    }
}
