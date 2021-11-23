package home_tasks.mkushnirenko.hw7;

import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;//0 means graduated
    private Map<String, Integer> grades;


    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    double getAverageGrade() {
        return grades.values().stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}