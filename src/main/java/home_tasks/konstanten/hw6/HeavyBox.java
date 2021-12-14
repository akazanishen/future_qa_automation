package home_tasks.konstanten.hw6;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private double kg;

    public HeavyBox(double kg) {
        this.kg = kg;
    }

    public double getKG() {
        return this.kg;
    }
    public void addKG() {
         this.kg++;
    }
}
class HeavyBox2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        List<HeavyBox> HeavyBox = new ArrayList<>();
        HeavyBox.add(new HeavyBox(100));
        HeavyBox.add(new HeavyBox(500));
        HeavyBox.add(new HeavyBox(500));
        HeavyBox.add(new HeavyBox(501));
        HeavyBox.add(new HeavyBox(1000));
        HeavyBox.add(new HeavyBox(1001));
        System.out.println("HeavyBox list + For each");
        HeavyBox.forEach(a -> System.out.println(a.getKG()));

        HeavyBox.get(0).addKG();
        System.out.println("\nHeavyBox Increase weight by 1 = " + HeavyBox.get(0).getKG());

        HeavyBox.remove(HeavyBox.size() - 1);
        System.out.println("\nDelete last HeavyBox = ");
        HeavyBox.forEach(b -> System.out.println(b.getKG()));

        HeavyBox.clear();
        System.out.println("\nDelete all HeavyBox = ");
        HeavyBox.forEach(c -> System.out.println(c.getKG()));

    }

}