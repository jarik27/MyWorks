package recap.lecture10;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private List<Product> listOfProduct = new ArrayList<>();

    public void printAllProducts() {
        for (int counter = 0; counter < listOfProduct.size(); counter++) {
            Product existingProduct = listOfProduct.get(counter);
            System.out.println(existingProduct.getName() + " " + existingProduct.getPrice());
        }
    }
    public List<Product> getListOfProduct(){
        return listOfProduct;
    }
    public void setListOfProduct(List<Product>listOfProduct){
        this.listOfProduct=listOfProduct;
    }

    public void insertProduct(Product incomingProduct) { // metod nichego ne vozvrashaet. znachit VOID
        listOfProduct.add(incomingProduct);
    }

    public void removeProduct(int index) { // metod nichego ne vozvrashaet. znachit VOID
        listOfProduct.remove(index);
    }

    public int getIndexOfProduct(String incomingProductName) { // metod vozvrashaet tip INT
        for (int counter = 0; counter < listOfProduct.size(); counter++) {
            Product product = listOfProduct.get(counter);
            String nameOfProduct = product.getName();
            if (nameOfProduct.equalsIgnoreCase(incomingProductName)) {
                return counter;
            }
        }
        return -1;
    }
}
