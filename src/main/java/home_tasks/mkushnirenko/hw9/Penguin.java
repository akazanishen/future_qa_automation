package home_tasks.mkushnirenko.hw9;

public class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "I am swimming.";
    }

    @Override
    public String sing() {
        return "Pi-pi-pi";
    }

    @Override
    public String favoriteFood() {
        return "Octopus";
    }

    @Override
    public String generalFood() {
        return "Fish";
    }

    @Override
    public String mainHabitat() {
        return "Antarctica";
    }

    @Override
    public String possibleHabitat() {
        return "Peru";
    }

    @Override
    public String getGenus() {
        return "Spheniscus";
    }

    @Override
    public String getFamily() {
        return "Spheniscidae";
    }

    @Override
    public String getOrder() {
        return "Sphenisciformes";
    }

    @Override
    public String getPhylum() {
        return "Chordates";
    }
}
