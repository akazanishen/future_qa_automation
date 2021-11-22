package home_tasks.mkushnirenko.hw7;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    //Перебрать и распечатать пары значений - entrySet().
    public static void printPairOfValues(Map<String, Product> h) {
        System.out.println("The set is: " + h.entrySet());
    }

    //Перебрать и распечатать значения продуктов - values().
    private static void printValues(HashMap<String, Product> products) {
        System.out.println("Values: " + products.values());
    }

    //Перебрать и распечатать набор из имен продуктов  - keySet().
    private static void printKeys(HashMap<String, Product> products) {
        System.out.println("Keys: " + products.keySet());
    }


    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<>();
        products.put("pig", new Product(1, "Pepa"));
        products.put("dog", new Product(2, "Rex"));
        products.put("cat", new Product(3, "Pushoc"));
        products.put("car", new Product(4, "Sam"));
        products.put("bear", new Product(5, "Barni"));
        products.put("helicopter", new Product(6, "H123"));
        products.put("cow", new Product(7, "Mooooo"));
        products.put("tiger", new Product(8, "Alex"));

        //Перебрать и распечатать пары значений - entrySet().
        printPairOfValues(products);
        //Перебрать и распечатать набор из имен продуктов  - keySet().
        printKeys(products);
        //Перебрать и распечатать значения продуктов - values().
        printValues(products);

    }
}