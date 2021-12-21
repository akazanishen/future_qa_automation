package home_tasks.mkushnirenko.hw10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = new String[]{"qqweew", "poiuh", "dcfvbnm", "fcgvhbjnk hjdsbfhb c menbcn", "fbdsjhcds"};
        List<String> sortedStrings = Arrays.stream(strings).sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);
    }
}
