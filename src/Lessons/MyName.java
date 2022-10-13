package Lessons;

import java.util.Scanner;

public class MyName {
  public static void main(String [] args) {
  System.out.println("My name is Nikita Plotnitskiy");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Меня зовут " + name);
  }
}
