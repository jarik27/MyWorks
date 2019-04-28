package recap.task3;

import java.util.Scanner;

public class WordCharacterSeparator {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter String");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] stringToArray = name.toCharArray();
        for (int i = 0; i < stringToArray.length; i++) {
            System.out.print(stringToArray[i] + " ");
        }
    }
}
