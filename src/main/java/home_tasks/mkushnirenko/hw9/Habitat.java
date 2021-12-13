package home_tasks.mkushnirenko.hw9;

public interface Habitat {
    String mainHabitat();

    String possibleHabitat();

    default String generalHabitat() {
        return "Earth";
    }
}
