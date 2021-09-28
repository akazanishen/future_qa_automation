package lessons.l3;

import lessons.l2.Human;

public class Employee extends Human {

  String department;

  public Employee(String name, byte age, String department) {
    super(name, age);
    this.department = department;
  }

/*
  public Employee(String name, byte age) {
    super(name, age);
  }
*/

  public void doWork() {
    System.out.println("In doWork in " + department);
    super.printNameToConsole();
  }

  @Override
  public void printNameToConsole() {
    System.out.println(department);
  }
}
