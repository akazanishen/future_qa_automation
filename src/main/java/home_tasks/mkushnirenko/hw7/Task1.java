package home_tasks.mkushnirenko.hw7;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        //а) Создать динамический массив, содержащий объекты класса HeavyBox.
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(5));
        heavyBoxes.add(new HeavyBox(56));
        heavyBoxes.add(new HeavyBox(7));
        heavyBoxes.add(new HeavyBox(12));
        heavyBoxes.add(new HeavyBox(1));
        heavyBoxes.add(new HeavyBox(34));
        heavyBoxes.add(new HeavyBox(72));
        heavyBoxes.add(new HeavyBox(6));


        //б) Распечатать его содержимое используя for each.
        heavyBoxes.forEach(e -> System.out.println(e.getWeight()));


        //в) Изменить вес первого ящика на 1.
        heavyBoxes.get(0).increaseWeightByOne();
        System.out.println("\nheavyBoxes[0] after increase = " + heavyBoxes.get(0).getWeight());

        //г) Удалить последний ящик.
        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println("\nAfter remove last element:");
        heavyBoxes.forEach(e -> System.out.println(e.getWeight()));

        //д) Удалить все ящики.
        heavyBoxes.clear();
        System.out.println("\nAfter remove all elements:");
        heavyBoxes.forEach(e -> System.out.println(e.getWeight()));

    }
}