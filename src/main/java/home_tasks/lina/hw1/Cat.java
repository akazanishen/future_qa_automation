package home_tasks.lina.hw1;

public class Cat {

    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void printToConsole() {
        System.out.println("Cat : name = " + name + " , age = " + age + " , color = " + color + " , breed = " + breed + " , weight = " + weight);
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void eat() {
        weight = weight + 0.1;
        System.out.println("Ate");
        System.out.println("New Weight = " + weight);
    }
}
