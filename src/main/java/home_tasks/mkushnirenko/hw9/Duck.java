package home_tasks.mkushnirenko.hw9;

public class Duck extends Bird {
    Duck(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "I am flying.";
    }

    @Override
    public String sing() {
        return "Krya-krya";
    }

    @Override
    public String favoriteFood() {
        return "Green";
    }

    @Override
    public String generalFood() {
        return "Vegetables";
    }

    @Override
    public String mainHabitat() {
        return "River";
    }

    @Override
    public String possibleHabitat() {
        return "Pond";
    }

    @Override
    public String getGenus() {
        return "Anas";
    }

    @Override
    public String getFamily() {
        return "Anatidae";
    }

    @Override
    public String getOrder() {
        return "Anseriformes";
    }

    @Override
    public String getPhylum() {
        return "Chordata";
    }
}
