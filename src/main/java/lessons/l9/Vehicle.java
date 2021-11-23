package lessons.l9;

public class Vehicle {
    public String name;
    protected int tiresCount;
    private Integer age;

    public int getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Please use valid value for age.");
        }

    }
}
