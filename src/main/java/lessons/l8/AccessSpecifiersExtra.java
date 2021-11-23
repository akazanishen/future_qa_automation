package lessons.l8;

import lessons.l9.StaticTest;
import lessons.l9.Bike;

public class AccessSpecifiersExtra {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.name = "BMW";
//        bike.seats = 2;       - another package
//        bike.tiresCount = 2;  - protected field
//        bike.age = 10;        - private field
        bike.setAge(8);
    }
}
