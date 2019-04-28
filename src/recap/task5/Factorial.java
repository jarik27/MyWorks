package recap.task5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number. -1 is special command to exit");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            } else if (number < 0) {
                System.out.println("This is negative number");
            } else if (number == 0) {
                System.out.println("Result: 1");
            }else {
                int result = 1;
                for (int counter = number; counter>1;counter--){
                    result = result*counter;
                }
                System.out.println("Result: " + result);
            }

        }

    }
}
