package home_tasks.diana.hw7;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> toy = new HashMap<>();

        toy.put("Barbie", "doll");
        toy.put("Lego", "constructor");
        toy.put("Hot wheels", "car&track");

        Product myProduct = new Product();

        myProduct.displayKeysAndValues(toy);
        myProduct.displayNames(toy);
        myProduct.displayTypes(toy);

    }
}


class Product {

    public void displayKeysAndValues(Map<String, String> product) {
        System.out.println("The product set is: " + product.entrySet());
    }

    public void displayNames(Map<String, String> product) {
        System.out.println("The product names are: " + product.keySet());
    }

    public void displayTypes(Map<String, String> product) {
        System.out.println("The product types are: " + product.values());
    }

}