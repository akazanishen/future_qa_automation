package home_tasks.diana.hw1;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] array = new int[9];
        array[0] = 10;
        array[1] = 8;
        array[2] = 7;
        array[3] = 5;
        array[4] = 2;
        array[5] = 3;
        array[6] = 4;
        array[7] = 6;
        array[8] = 9;

        int fullArrayLength = array.length+1;

        int expectedSum = (fullArrayLength)*(fullArrayLength+1)/2;
        int actualSum = 0;

        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        System.out.println("Missing number is: " + (expectedSum - actualSum));
    }
}