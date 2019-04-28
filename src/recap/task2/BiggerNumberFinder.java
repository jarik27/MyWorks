package recap.task2;

import java.util.Scanner;

public class BiggerNumberFinder {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter 1 number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Welcome stranger. Enter 2 number");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("First number: " + number1 + " is bigger than second number: " + number2);
        } else if (number1 < number2) {
            System.out.println("Second number: " + number2 + " is bigger than first number: " + number1);
        } else {
            System.out.println("You entered 2 numbers: " + number1 + " and " + number2 + "." + " Numbers are the same.");
        }
    }
}
