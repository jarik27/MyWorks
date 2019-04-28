package recap.task4;

import java.util.Scanner;

public class WelcomeAgain {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Enter Your password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.equals("password")){
            System.out.println("Please enter the second password");
            Scanner scanner1 = new Scanner(System.in);
            String password2 = scanner1.nextLine();

            if (password2.equals("password2")){
                System.out.println("Welcome to the Club");
            }else {
                System.out.println("Second password is wrong");
            }
        }else {
            System.out.println("First password is wrong");
        }
    }
}
