package lessons.l2;

public class Human {

    String name;
    byte age;

    public Human(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public void printNameToConsole() {
        System.out.println(name);
    }

    public String getNameAndAgeAndGender(String gender) {
        return this.name + this.age + gender;
    }

    public String getNameAndAgeAndGender(boolean gender) {
        return this.name + this.age + gender;
    }
}
