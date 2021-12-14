package home_tasks.konstanten.hw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class Product2 {
     int Pid;
     String Items;

    Product2(int pid, String items){
        this.Pid = pid;
        this.Items = items;
    }
     public String toString() {
         return "Product{" +
                 "Id=" + Pid +
                 ", Name='" + Items + '\'' +
                 '}';
     }

}

    public class Product {

    public static void showProducts(Map<String, Product2> a) {
        System.out.println("Show product set: " + a.entrySet());
    }
        public static void showNames(Map<String, Product2> Items) {
            System.out.println("Show Names: " + Items.keySet());
    }
    public static void showValues(Map<String, Product2> Items) {
            System.out.println("Show Values: " + Items.values());
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        HashMap<String, Product2> Items = new HashMap<>();
        Items.put("product1", new Product2(1, "car"));
        Items.put("product2", new Product2(2, "bike"));
        Items.put("product3", new Product2(3, "boat"));
        Items.put("product4", new Product2(4, "rocket"));
        Items.put("product5", new Product2(5, "satellite"));
        Items.put("product6", new Product2(6, "station"));

        showProducts(Items);
        showValues(Items);
        showNames(Items);

    }
}
