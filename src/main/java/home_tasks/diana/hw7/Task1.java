package home_tasks.diana.hw7;


import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        HeavyBox heavyBor1 = new HeavyBox("Plates", 7);
        HeavyBox heavyBor2 = new HeavyBox("Books", 10);
        HeavyBox heavyBor3 = new HeavyBox("Clothes", 8.7);

        // a)
        List<HeavyBox> myBoxes = new ArrayList<>();
        myBoxes.add(heavyBor1);
        myBoxes.add(heavyBor2);
        myBoxes.add(heavyBor3);

        // б)
        myBoxes.forEach(el -> el.displayNameAndWeight());

        //в)
        myBoxes.get(0).setWeight(heavyBor1.getWeight() + 1);
        myBoxes.forEach(el -> el.displayNameAndWeight());

        //г)
        myBoxes.remove(myBoxes.size() - 1);
        myBoxes.forEach(el -> el.displayNameAndWeight());

        //д)
        // myBoxes.removeAll(myBoxes);
        myBoxes.clear();
        myBoxes.forEach(el -> el.displayNameAndWeight());

    }
}

class HeavyBox {
    String name;
    double weightKg;


    public HeavyBox(String name, double weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

    public void displayNameAndWeight() {
        System.out.println(name + " " + weightKg + "kg");
    }

    public void setWeight(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeight() {
        return this.weightKg;
    }

}






