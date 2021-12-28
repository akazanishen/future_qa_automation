package home_tasks.mkushnirenko.hw11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}
