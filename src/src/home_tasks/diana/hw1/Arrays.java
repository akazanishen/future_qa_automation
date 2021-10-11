package home_tasks.diana.hw1;

public class Arrays {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }
    }
}
