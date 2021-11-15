package home_tasks.diana.hw7;


import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> toy = new HashMap<>();

        toy.put("Barbie", "doll");
        toy.put("Lego", "constructor");
        toy.put("Hot wheels", "car&track");

        System.out.println("The product set is: " + toy.entrySet());
        System.out.println("The product names are: " + toy.keySet());
        System.out.println("The product types are: " + toy.values());

    }
}
