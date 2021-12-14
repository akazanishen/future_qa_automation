package home_tasks.mkushnirenko.hw9;

public interface Taxonomy {
    String getGenus();

    String getFamily();

    String getOrder();

    String getPhylum();

    default String getKingdom() {
        return "Animalia";
    }
}
