package recap.task7;

import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter the sentence");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the order of the sentence. If you are done write Done");
            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Which order for the sentence you want to print");

            }
            String numberOfWord = scanner.nextLine();
            int userRequestNumber = Integer.parseInt(numberOfWord);
            if (Integer.parseInt(numberOfWord) <= 0) {
                System.out.println("Cannot accept");
            } else {
                input = input.trim().replaceAll("\\s+"," ");
                String[] arrSplit = input.split(" ");
               if (userRequestNumber>arrSplit.length){
                   System.out.println("We cannot find.");
               }else {
                   System.out.println("Result word: " + arrSplit[userRequestNumber-1]);
               }
            }
        }


    }
}
