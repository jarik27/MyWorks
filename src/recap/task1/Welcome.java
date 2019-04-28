package recap.task1;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter Your full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("James Bond")){
            System.out.println("Welcome 007");
        } else {
            System.out.println("You are not agent. Get out!");
        }
    }
}
