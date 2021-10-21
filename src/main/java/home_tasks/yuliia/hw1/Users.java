package home_tasks.yuliia.hw1;

public class Users {
    String firstname;
    int ssn;

    public Users (String name, int ssn) {
        this.firstname = name;
        this.ssn = ssn;
    }

    public Users () {
    }

    public void printFirstnameToConsole() {
        System.out.println(firstname);
    }

    public String getFirstnameAndSsnAndGender(String gender) {
        return this.firstname + this.ssn + gender;
    }

    public String getFirstnameAndSsnAndGender(boolean gender) {
        return this.firstname + this.ssn + gender;
    }
}
