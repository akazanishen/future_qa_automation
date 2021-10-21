package home_tasks.diana.hw3;

public class Bar extends CateringInstitution {

    boolean dressCodeRequired;
    boolean faceControl;
    String barType;
    int entranceFee;


    public Bar(String name, int opensAt, int closesAt, double googleRating, String barType, int entranceFee) {
        this.name = name;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
        this.googleRating = googleRating;
        this.barType = barType;
        this.entranceFee = entranceFee;
    }

    public void displayEntranceFee() {
        if (entranceFee > 0) {
            System.out.println("Entrance fee is " + entranceFee);
        } else
            System.out.println("Entrance is free today!");
    }

    public void open() {
        isOpen = true;
        System.out.println("Hey! Hey! Hey! " + name + " is open! \nCome and taste our new coctail!");
    }

    public void displayWorkingHours() {
        System.out.println("We are waiting for you from " + opensAt + " till the end!");
    }


}
