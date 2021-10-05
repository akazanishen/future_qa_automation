package home_tasks.diana.hw1;

public class HomeTask1 {
    public static void main(String[] args) {

        CoffeeHouse myCoffeeHouse = new CoffeeHouse("Bakery street", 8, 21, false, "13-14", true, 4.73);
        Bar myBar = new Bar("Would you like bar", 19, 03, 4.4, "lounge", 0);
        Restaurant myRestaurant = new Restaurant("Mushlya", 10, 22, 3.95, "Seafood");


        myCoffeeHouse.open();
        myCoffeeHouse.displayWorkingHours();

        myBar.open();
        myBar.displayWorkingHours();
        myBar.displayEntranceFee();

        myRestaurant.open();
        myRestaurant.displayWorkingHours();

    }
}
