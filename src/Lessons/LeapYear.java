package Lessons;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Input year");
        year = sc.nextInt();
        if(year % 4 == 0 || year % 400 == 0) {
            System.out.println("There are 366 days in a year");
        } else if (year % 100 == 0) {
            System.out.println("There are 365 days in a year");
        }else {
            System.out.println("There are 365 days in a year");
        }
    }
}
