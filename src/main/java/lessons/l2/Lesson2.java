package lessons.l2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Human firstPerson = new Human();
        firstPerson.age = 11;
        firstPerson.name = "Natasha";

        Human secondPerson = new Human("Alex", (byte) 20);


        System.out.println(firstPerson.getNameAndAgeAndGender(true));
        System.out.println(firstPerson.getNameAndAgeAndGender("MALE"));

        System.out.println(firstPerson.age);
        System.out.println(firstPerson.name);

        System.out.println(secondPerson.age);
        System.out.println(secondPerson.name);
    }
}
