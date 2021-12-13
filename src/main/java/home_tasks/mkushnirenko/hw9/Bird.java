package home_tasks.mkushnirenko.hw9;

public abstract class Bird implements Food, Habitat, Taxonomy {
    private final String name;

    public abstract String move();

    public abstract String sing();

    Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
