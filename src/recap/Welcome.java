package recap;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter Your full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String nameTrue = "James Bond";
        String name2 = "james bond";

        if (name.toLowerCase().equals(name2)){
            System.out.println("Welcome 007");
        } else {
            System.out.println("You are not agent. Get out!");
        }
    }
}
