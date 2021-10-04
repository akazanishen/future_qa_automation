package home_tasks.diana.hw1;

public class CoffeeHouse extends CateringInstitution {

    String sortOfCoffee;
    String milk;

    public CoffeeHouse(String name, int opensAt, int closesAt, boolean isOpen, String breakHours, boolean petFriendly, double googleRating) {
        this.name = name;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
        this.isOpen = isOpen;
        this.breakHours = breakHours;
        this.petFriendly = petFriendly;
        this.googleRating = googleRating;
    }

    public void open() {
        isOpen = true;
        System.out.println("Welcome! " + name + " is open!");
    }

    public void close() {
        isOpen = false;
        System.out.println("Sorry, " + name + " is closed!");
    }

    public void serveCoffee() {
        System.out.println("You're coffee " + sortOfCoffee + " with " + milk + " milk is ready!");
    }
}
