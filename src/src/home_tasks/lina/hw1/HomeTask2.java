package home_tasks.lina.hw1;

public class HomeTask2 {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Murka", 1);

        Cat secondCat = new Cat("Oskar", "white", "Maine Coon", 5, 8.8);

        System.out.println(firstCat.age);
        System.out.println(firstCat.name);

        System.out.println(secondCat.age);
        System.out.println(secondCat.name);
        System.out.println();
        secondCat.printToConsole();
        secondCat.eat();
        secondCat.eat();
        secondCat.eat();
        secondCat.eat();
        secondCat.meow();
        secondCat.printToConsole();

        System.out.println();
        Car defaultCar = new Car();
        System.out.println("Default car age = " + defaultCar.age);


        Car oldCar = new Car("Audi", 25, 250000, false, true);
        oldCar.printOdometerValueAndLightStatus();
        oldCar.turnLightOn();
        oldCar.printOdometerValueAndLightStatus();
        oldCar.turnLightOff();
        oldCar.printOdometerValueAndLightStatus();
        oldCar.move();
        oldCar.move();
        oldCar.move();
        oldCar.move();
        oldCar.move();
        oldCar.move();
        oldCar.printOdometerValueAndLightStatus();
    }
}
