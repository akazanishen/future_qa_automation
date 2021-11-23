package home_tasks.diana.hw7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userValuesString = scanner.nextLine();

        List<String> userValuesList = Arrays.asList(userValuesString.split("\\s*,\\s*"));

        Set<String> userUniqueValues = new HashSet<>();
        userUniqueValues.addAll(userValuesList);

        userUniqueValues.forEach(el -> System.out.println(el));

    }

};

