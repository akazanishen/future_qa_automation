package home_tasks.diana.hw1;

public class Restaurant extends CateringInstitution {

    String kitchenType;
    boolean isHappyHours;
    boolean isTablesAvailable;

    public Restaurant(String name, int opensAt, int closesAt, double googleRating, String kitchenType) {
        this.name = name;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
        this.googleRating = googleRating;
        this.kitchenType = kitchenType;
    }

    public void open() {
        isOpen = true;
        System.out.println("Dear Guests! " + name + " is open! \nEnjoy your best meal in our family restaurant.");
    }

    public void displayWorkingHours() {
        System.out.println("We are open from " + opensAt + " till " + closesAt + ".");
    }
}
