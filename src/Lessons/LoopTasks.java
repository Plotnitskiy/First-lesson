package Lessons;
import java.util.Scanner;
public class LoopTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA;
        int numberB;
        int yesOrNot;
        do{
        System.out.println("Input numberA");
        numberA = scanner.nextInt();
        System.out.println("Input numberB");
        numberB = scanner.nextInt();
        System.out.println(numberA * numberB);
        System.out.println("once again?");
        yesOrNot = scanner.nextInt();
        } while (yesOrNot != 1);
            System.out.println("Operation is cancelled");
    }
}
