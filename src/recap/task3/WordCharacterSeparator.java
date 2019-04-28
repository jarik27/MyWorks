package recap.task3;

import java.util.Scanner;

public class WordCharacterSeparator {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter String");
        Scanner scanner = new Scanner(System.in); //creating an object.
        String name = scanner.nextLine(); // reads the user input as sentence
        char[] stringToArray = name.toCharArray(); // creates an array from characters of string

        for (int counter = 0; counter < stringToArray.length; counter++) {
            System.out.print(stringToArray[counter] + " ");
        }
    }
}
