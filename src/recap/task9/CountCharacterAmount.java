package recap.task9;

import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterAmount {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Write the char to search in the string");
        Character selectedChar = scanner.nextLine().charAt(0);


        int totalAmount = 0;
        char[] totalChars = input.toCharArray();
        for (char incomingChar : totalChars) {
            if (incomingChar == selectedChar) {
                totalAmount++;
            }
        }
        System.out.println("Result:" + totalAmount);
    }
}






