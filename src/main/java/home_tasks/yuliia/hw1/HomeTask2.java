package home_tasks.yuliia.hw1;

import lessons.l2.Human;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Users firstUser = new Users();
        firstUser.ssn = 666111111;
        firstUser.firstname = "Smith";

        Users secondUser = new Users();
        secondUser.ssn = 666222222;
        secondUser.firstname = "Bond";

        Users thirdUser = new Users();
        thirdUser.ssn = 666333333;
        thirdUser.firstname = "Johnson";


        System.out.println(firstUser.getFirstnameAndSsnAndGender(true));
        System.out.println(firstUser.getFirstnameAndSsnAndGender("MALE"));

        System.out.println(firstUser.ssn);
        System.out.println(firstUser.firstname);

        System.out.println(secondUser.ssn);
        System.out.println(secondUser.firstname);

        System.out.println(thirdUser.ssn);
        System.out.println(thirdUser.firstname);
    }
}
