package home_tasks.diana.hw4;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arrayWithMissingNumber = {10, 8, 7, 5, 2, 3, 4, 6, 9};

        int fullArrayLength = arrayWithMissingNumber.length+1;

        int expectedSum = (fullArrayLength)*(fullArrayLength+1)/2;
        int actualSum = 0;

        for (int i = 0; i < arrayWithMissingNumber.length; i++) {
            actualSum += arrayWithMissingNumber[i];
        }
        System.out.println("Missing number is: " + (expectedSum - actualSum));
    }
}