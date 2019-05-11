package recap.lecture10;

import java.util.List;
import java.util.Scanner;

public class SuperMarketApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Admin to the Market Application");

        //This superMarket object will contain the product list.
        SuperMarket superMarket = new SuperMarket();

        SuperMarketApplication superMarketApplication = new SuperMarketApplication();


        while (true) {
            System.out.println("What do You want to do: Add - Remove - Done");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Add")) {
                superMarketApplication.addNewProduct(superMarket);
                // This place runs if the input was add
                // superMarketApplication.addNewProduct(SuperMarket);
            } else if (userInput.equalsIgnoreCase("Remove")) {
                superMarketApplication.removeProduct(superMarket);
                //This place will run if the input is remove

            } else if (userInput.equalsIgnoreCase("Done")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }

        }
        superMarket.printAllProducts();
        System.out.println("Please enter your budget");
        double budget = Double.parseDouble(scanner.nextLine());
        Account account = new Account(budget);
        System.out.println("Your budget is " + account.getBalance());

        while (true) {
            System.out.println("What do you want to buy (done = finish buying)");
            String userInput2 = scanner.nextLine();
            if (userInput2.equalsIgnoreCase("done")) {
                break;
            }
            int indexOfProduct = superMarket.getIndexOfProduct(userInput2);
            if (indexOfProduct == -1) {
                System.out.println("This item does not exist");
            } else {
                SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
                List<Product> listOfProducts = superMarket.getListOfProduct();
                Product selectedProduct = listOfProducts.get(indexOfProduct);
                System.out.println("How many of " + selectedProduct.getName() + " do You want to buy");

                int requestedQuantity = Integer.parseInt(scanner.nextLine());
                double totalCost = selectedProduct.getPrice() * requestedQuantity;
                totalCost = superMarketUtilities.round(totalCost);

                boolean isEnoughMoney = account.deduct(totalCost);
                if (isEnoughMoney) {
                    System.out.println("You bought " + selectedProduct.getName());
                    account.addUpdateProduct(selectedProduct.getName(), requestedQuantity);
                }
            }
        }
        account.printAccountInfo();






    }

    /**
     * This will try to add new product to the super market.
     */
    private void addNewProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name");
        String incomingProductName = scanner.nextLine();

        //This will return either -1 or the index of the product in the list.
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct == -1) {
            System.out.println("Enter the product price");
            Double incomingPrice = Double.parseDouble(scanner.nextLine());
            SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
            incomingPrice = superMarketUtilities.round(incomingPrice);

            Product insertableProduct = new Product(incomingProductName, incomingPrice);

            //We are good to go. Because there is no product with this name
            superMarket.insertProduct(insertableProduct);


        } else {
            System.out.println("This product name already exists.");
        }

    }

    private void removeProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name to be removed");
        String incomingProductName = scanner.nextLine();

        //This will return either -1 or the index of the product in the list.
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct == -1) {
            System.out.println("This product does not exists");
        } else {
            System.out.println("Product removed.");
            superMarket.removeProduct(indexOfProduct);
        }
    }
}
