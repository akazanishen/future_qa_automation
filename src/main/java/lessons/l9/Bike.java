package lessons.l9;

public class Bike extends Vehicle{
    int seats;

    public void getFullInfo() {
        System.out.println(this.seats);
        System.out.println(this.name);
        System.out.println(this.tiresCount);
//        System.out.println(this.age);
    }
}
