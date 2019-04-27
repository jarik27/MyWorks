package recap;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter Your full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String nameTrue = "James";

        if (name == nameTrue) {
            System.out.println("Welcome 007");
        }else {
            System.out.println("Get out!");
        }

    }
}
