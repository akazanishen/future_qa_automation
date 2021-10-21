package home_tasks.lina.hw1;

public class Car {

    String model;
    int age;
    int odometer;
    boolean isLightTurnOn;
    boolean canDrive;

    public Car(String model, int age, int odometer, boolean isLightTurnOn, boolean canDrive) {
        this.model = model;
        this.age = age;
        this.odometer = odometer;
        this.isLightTurnOn = isLightTurnOn;
        this.canDrive = canDrive;
    }

    public Car() {
    }

    public void printOdometerValueAndLightStatus() {
        System.out.println("Car model: " + model + ", odometer value: " + odometer + ", lightning = " + isLightTurnOn);
    }

    public void turnLightOff() {
        isLightTurnOn = false;
    }

    public void turnLightOn() {
        isLightTurnOn = true;
    }

    public void move() {
        odometer = odometer + 1;
    }
}
