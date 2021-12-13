package home_tasks.mkushnirenko.hw9;

public class Ostrich extends Bird {
    Ostrich(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "I am running.";
    }

    @Override
    public String sing() {
        return "Uuuuu";
    }

    @Override
    public String favoriteFood() {
        return "Seed";
    }

    @Override
    public String generalFood() {
        return "Fruits";
    }

    @Override
    public String mainHabitat() {
        return "Savanna";
    }

    @Override
    public String possibleHabitat() {
        return "Desert";
    }

    @Override
    public String getGenus() {
        return "Struthio";
    }

    @Override
    public String getFamily() {
        return 	"Struthionidae";
    }

    @Override
    public String getOrder() {
        return "Struthioniformes";
    }

    @Override
    public String getPhylum() {
        return "Chordata";
    }
}
