package recap.task2;

import java.util.Scanner;

public class BiggerNumberFinder {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter 1 number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Welcome stranger. Enter 2 number");
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("1 number: " + number1 + " is bigger than 2 number: " + number2);
        }else if (number1 < number2){
            System.out.println("2 number: " + number2 +" is bigger than 1 number: " + number1);
        }else {
            System.out.println("Numbers are the same");
        }
    }
}
