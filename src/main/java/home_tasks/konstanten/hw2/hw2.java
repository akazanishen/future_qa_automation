package home_tasks.konstanten.hw2;

import lessons.l2.Human;

public class hw2 {

    public static void main(String[] args){
        System.out.println("Hello World!");

        Chair firstParts = new Chair();
        firstParts.leg = 4;
        firstParts.back = "Back";

        Chair secondParts = new Chair("Seat", (byte) 8);

        System.out.println(firstParts.getBackAndLegAndSeat(true));
        System.out.println(firstParts.getBackAndLegAndSeat("Back"));

        System.out.println(firstParts.leg);
        System.out.println(firstParts.back);

        System.out.println(secondParts.leg);
        System.out.println(secondParts.back);
    }
}
