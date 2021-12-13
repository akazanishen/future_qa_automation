package home_tasks.mkushnirenko.hw9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Duck("Scrooge McDuck"));
        birds.add(new Ostrich("Ostrich number 1"));
        birds.add(new Penguin("Lolo the Penguin"));

        for (Bird bird : birds) {
            System.out.println(
                    "My name is " + bird.getName() + "\n" +
                            bird.move() + "\n" +
                            "I say \"" + bird.sing() + "\"\n" +
                            "My favorite food is " + bird.favoriteFood() + "\n" +
                            "My general food is " + bird.generalFood() + "\n" +
                            bird.iWantEat() + "\n" +
                            "I live in " + bird.mainHabitat() + "\n" +
                            "I can live in " + bird.possibleHabitat() + "\n" +
                            "My home is " + bird.generalHabitat() + "\n" +
                            "My Taxonomy:\n" +
                            "\tKingdom: " + bird.getKingdom() + "\n" +
                            "\tPhylum: " + bird.getPhylum() + "\n" +
                            "\tOrder: " + bird.getOrder() + "\n" +
                            "\tFamily: " + bird.getFamily() + "\n" +
                            "\tGenus: " + bird.getGenus() + "\n\n"
            );


        }

    }
}
