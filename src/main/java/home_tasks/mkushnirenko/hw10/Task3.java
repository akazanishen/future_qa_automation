package home_tasks.mkushnirenko.hw10;


import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;

public class Task3 {

    static boolean isValidISODateTime(String date) {
        try {
            ISO_DATE_TIME.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        dates.add(new Date().toInstant().toString());
        dates.add(new Date().toInstant().plusSeconds(1000).toString());
        dates.add("12:45:3456");
        dates.add(new Date().toInstant().minusSeconds(345678).toString());
        dates.add(new Date().toInstant().plusSeconds(345681).toString());
        dates.add("qwert 678 67ghh");
        dates.add("qwert 678 67ghh");//duplicate
        dates.add(new Date().toInstant().plusSeconds(1234567890).toString());
        dates.add("Mon rt 4 qa 2021");
        dates.add(new Date().toInstant().minusSeconds(23456789).toString());
        dates.add(new Date().toInstant().plusSeconds(9876543).toString());
        dates.add(dates.get(0));//duplicate

        Map<String, Boolean> map = dates.stream()
                .collect(Collectors.toMap(Function.identity(), Task3::isValidISODateTime, (x, y) -> x));
        System.out.println(map);

    }
}
