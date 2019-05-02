package task7;

import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (true) {
            System.out.println("Enter the order of the sentence");
            int number = scanner.nextInt();
            String[] arrSplit = input.split(" ");

            if (number < 0) {
                System.out.println("Error");
            } else if (number > arrSplit.length) {
                System.out.println("Sentence does not have this much of words");
            } else {

                System.out.println(arrSplit[number]);
                break;
            }
        }


    }
}
