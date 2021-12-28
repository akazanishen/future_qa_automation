package home_tasks.mkushnirenko.hw11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b) {
            System.out.println(a - b);
        } else
            throw new ALessThenBException(a + " less then " + b + " during |a-b|");
    }
}

class ALessThenBException extends RuntimeException {
    public ALessThenBException(String message) {
        super(message);
    }
}
