package home_tasks.diana.hw7;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> toy = new HashMap<>();

        toy.put("Barbie", "doll");
        toy.put("Lego", "constructor");
        toy.put("Hot wheels", "car&track");

        Product.displayKeysAndValues(toy);
        Product.displayNames(toy);
        Product.displayTypes(toy);

    }
}


class Product {

    public static void displayKeysAndValues(Map<String, String> product) {
        System.out.println("The product set is: " + product.entrySet());
    }

    public static void displayNames(Map<String, String> product) {
        System.out.println("The product names are: " + product.keySet());
    }

    public static void displayTypes(Map<String, String> product) {
        System.out.println("The product types are: " + product.values());
    }

}