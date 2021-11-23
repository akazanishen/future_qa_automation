package home_tasks.diana.hw7;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {

        Student petrov = new Student("Ivan Petrov", "ЕК1", 1, ImmutableMap.<String, Integer>builder()
                .put("Economics", 2)
                .put("History", 4)
                .put("Statistics", 1)
                .put("Culture", 1)
                .put("English", 3)
                .build());

        Student sidorov = new Student("Ievgen Sidorov", "ЕК2", 2, ImmutableMap.<String, Integer>builder()
                .put("Economics", 5)
                .put("History", 5)
                .put("Statistics", 4)
                .put("Culture", 5)
                .put("English", 4)
                .build());

        Student ivanov = new Student("Peter Ivanov", "ME2", 2, ImmutableMap.<String, Integer>builder()
                .put("Economics", 5)
                .put("History", 3)
                .put("Statistics", 4)
                .put("Culture", 3)
                .put("English", 2)
                .build());

        List<Student> studentList = new ArrayList<>();
        studentList.add(petrov);
        studentList.add(sidorov);
        studentList.add(ivanov);


    }
}


class Student {

    String name;
    String group;
    int year;
    Map<String, Integer> scores;

    public Student(String name, String group, int year, Map<String, Integer> scores) {
        this.name = name;
        this.group = group;
        this.year = year;
        this.scores = scores;
    }


}