package home_tasks.mkushnirenko.hw7;

import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    private static void deductStudents(List<Student> students) {
        for (Student s : students) {
            if (s.getAverageGrade() < 3) {
                System.out.println(s + " was deducted.");
                students.remove(s);
            }
        }
    }

    private static void goToNextYear(List<Student> students) {
        for (Student s : students) {
            if (s.getAverageGrade() >= 3) {
                if (s.getCourse() > 3) {
                    System.out.println(s + " was graduated.");
                    s.setCourse(0);
                } else {
                    System.out.println(s + " was go to next year.");
                    s.setCourse(s.getCourse() + 1);
                }
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mariia", "IPS", 1, ImmutableMap.<String, Integer>builder()
                .put("Math", 5)
                .put("IT", 4)
                .put("System Programing", 4)
                .put("OS", 4)
                .put("English", 5)
                .put("QA", 5)
                .put("BA", 4)
                .build()));

        students.add(new Student("Anna", "IPS", 1, ImmutableMap.<String, Integer>builder()
                .put("Math", 2)
                .put("IT", 4)
                .put("System Programing", 1)
                .put("OS", 1)
                .put("English", 3)
                .put("QA", 3)
                .put("BA", 2)
                .build()));

        students.add(new Student("Ivan", "SPS", 4, ImmutableMap.<String, Integer>builder()
                .put("Math", 4)
                .put("IT", 3)
                .put("System Programing", 2)
                .put("OS", 3)
                .put("English", 5)
                .put("QA", 3)
                .put("BA", 5)
                .build()));

        printStudents(students, 1);

        deductStudents(students);
        goToNextYear(students);

        printStudents(students, 2);
    }
}