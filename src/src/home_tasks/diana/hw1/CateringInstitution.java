package home_tasks.diana.hw1;

public class CateringInstitution {

    String name;
    int opensAt;
    int closesAt;
    boolean isOpen;
    String breakHours;
    boolean petFriendly;
    double googleRating;

    public void open() {
        isOpen = true;
        System.out.println("Welcome! We are open!");
    }

    public void close() {
        isOpen = false;
        System.out.println("Sorry, we are closed");
    }

    public void displayWorkingHours() {
        System.out.println("We are open from " + opensAt + " till " + closesAt + ".\nConsider our break hours: " + breakHours + ".");
    }


}
