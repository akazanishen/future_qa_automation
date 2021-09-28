package lessons.l3;

import com.sun.codemodel.internal.JForEach;
import lessons.l2.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeTask1 {
    public static void main(String[] args) {
        //new Employee("Natalia", (byte) 17).doWork();
        //Object employeeObj = new Employee("Natalia", (byte) 17, "IT");
        Human employeeHum = new Employee("Serge", (byte) 18, "SD");
        Human human = new Human("Serge", (byte) 18);
        Employee employee = new Employee("Alina", (byte) 17, "Finance");

        //System.out.println(employeeObj.hashCode());
        employeeHum.printNameToConsole();
        human.printNameToConsole();
        employee.printNameToConsole();


        List<Human> list = new ArrayList<>();
        list.add(new Employee("Serge", (byte) 18, "SD"));
        list.add(new Human("Serge", (byte) 18));
        list.add(new Human("Serge", (byte) 18));
        list.add(new Employee("Alina", (byte) 17, "Finance"));
        list.add(new Human("max", (byte)41));

        for (Human o : list) {
            o.printNameToConsole();
        }
    }
}
