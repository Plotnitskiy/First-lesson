package Lessons;

import java.util.Scanner;

/**
 * Program that print a string
 * @autor Nikita Plotnitskiy
 * @version java 8.0.1
 */

public class MyName {
    /**
     * Start point.
     *
     * @param args command line args
     */
  public static void main(String [] args) {
  System.out.println("My name is Nikita Plotnitskiy");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Меня зовут " + name);
  }
}
