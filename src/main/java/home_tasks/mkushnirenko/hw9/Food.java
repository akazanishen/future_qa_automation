package home_tasks.mkushnirenko.hw9;

public interface Food {
    String favoriteFood();

    String generalFood();

    default String iWantEat() {
        return "I am hungry";
    }
}
