package recap.task6;

import java.util.Scanner;

public class FirstWordPrinter {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Enter the sentence. If You done write Done");
            String input = scanner.nextLine();

            if (input.equals("Done")){
                break;
            }else {
                String[] arrSplit = input.split(" ");
                System.out.println(arrSplit[0]);
            }
        }
    }
}
