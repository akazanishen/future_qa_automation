package home_tasks.konstanten.hw2;

public class Chair {
    String back;
    byte leg;

    public Chair(String back, byte leg) {
        this.back = back;
        this.leg = leg;
    }
    public Chair() {
    }

    public String getBackAndLegAndSeat(String Seat) {
        return this.back + this.leg + Seat;
    }
    public String getBackAndLegAndSeat(Boolean Seat) {
        return this.back + this.leg + Seat;
    }
}