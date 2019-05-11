package recap.lecture10;

import java.util.ArrayList;
import java.util.List;

public class Account {
    double balance;
    List<Product> listOfBoughtProducts = new ArrayList<>();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getProduct() {
        return listOfBoughtProducts;
    }

    public void setProduct(List<Product> product) {
        this.listOfBoughtProducts = product;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void printAccountInfo() {
        for (Product boughtProduct : listOfBoughtProducts) {
            System.out.println("Product name: " + boughtProduct.getName() + " Quantity: " + boughtProduct.getQuantity());
        }
        System.out.println("Last balance: " + balance);
        System.out.println("-----------------------");
    }

    public boolean deduct(double cost) {
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        cost = superMarketUtilities.round(cost);
        balance = superMarketUtilities.round(balance);
        if (balance < cost) {
            System.out.println("You do not have money");
            return false;
        } else {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        }
    }

    public void addUpdateProduct(String productName, int amount) {
        for (Product boughtExistingProduct: listOfBoughtProducts) {
            if (boughtExistingProduct.getName().equalsIgnoreCase(productName)){
                int updateAmount = boughtExistingProduct.getQuantity()+amount;
                boughtExistingProduct.setQuantity(updateAmount);
                return;
            }
        }
        Product newProduct = new Product();
        newProduct.setName(productName);
        newProduct.setQuantity(amount);
        listOfBoughtProducts.add(newProduct);
    }


}
