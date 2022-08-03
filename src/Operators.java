import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        System.out.println("Input number1");
        number1 = sc.nextInt();
        System.out.println("Input number2");
        number2 = sc.nextInt();
        System.out.println("Input number3");
        number3 = sc.nextInt();
        System.out.println("Input number4");
        number4 = sc.nextInt();
        if(number1>number2 && number1>number3 && number1>number4) {
            System.out.println(number1);
        }
        else if(number2>number1 && number2>number3 && number2>number4){
            System.out.println(number2);
        }
        else if(number3>number1 && number3>number2 && number3>number4){
            System.out.println(number3);
        }
        else {
            System.out.println(number4);
        }
    }
}
