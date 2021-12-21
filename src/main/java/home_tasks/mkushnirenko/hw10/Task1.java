package home_tasks.mkushnirenko.hw10;

import java.util.Random;
import java.util.function.IntPredicate;

public class Task1 {
    public static void main(String[] args) {
        IntPredicate intPredicate = x -> x % 2 == 0;
        long count = new Random().ints(100).filter(intPredicate).count();
        System.out.println(count);
    }
}
