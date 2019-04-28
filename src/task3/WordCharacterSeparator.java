package task3;

import java.util.Scanner;

public class WordCharacterSeparator {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter String");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.replace("", " ").trim();
        System.out.println(name);
    }
}
