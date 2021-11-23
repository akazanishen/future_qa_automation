package lessons.l9;

public class AccessSpecifiers {

    public final static double PI = 3.14;

    public static void main(String[] args) {
//        Bike bike = new Bike();
//        bike.name = "BMW";
//        bike.seats = 2;
//        bike.tiresCount = 2;
////        bike.age = 10;  - private field
//        bike.setAge(-1);
//        System.out.println(bike.getAge());






        StaticTest staticTest = new StaticTest();

        staticTest.spouse.firstName = "TestName";
        staticTest.spouseStatic.firstName = "TestName";

        StaticTest.SpouseStatic.firstName = "TestName";







    }
}
