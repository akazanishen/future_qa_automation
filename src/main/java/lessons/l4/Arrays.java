package lessons.l4;

import java.util.ArrayList;

public class Arrays {
  public static void main(String[] args) {

    String[] array; // declaration
    String[] arrayOfStrings = {"Joyful", "And", "Valuable", "Applets"}; // declaration + initialization

    for (String element : arrayOfStrings) {
      System.out.println(element);
    }

    int[] p = new int[5];
    p[0] = 2;
    p[1] = 3;
    p[2] = 5;
    p[3] = 7;
    p[4] = 11;
    for (int element : p) {
      System.out.println(element);
    }

//    p[100] = 0; // error
//    p.length; // array size is 5

    int[][] arr = new int[5][7];
    ArrayList<Integer> list = new ArrayList<>();
    list.add(42);
    list.add(42);
    list.add(42);
    list.add(42);
    list.size();
    list.forEach(element -> System.out.println(element));
//    arr[2][3] = 40;

    long fib[] = new long[50];
    fib[0] = 1;
    fib[1] = 1;
    for (int i=2; i<fib.length; i++) {
      fib[i] = fib[i-1] + fib[i-2];
    }
    for (int i=0; i<fib.length; i++) {
      System.out.println("fib[" + i + "] = " + fib[i]);
    }


    java.util.Arrays.copyOf(fib, fib.length);



    // a 3x3-matrix of integers (2-dim. array)
//
    int[][] matrix = new int[3][3];
    for (int row=0; row<3; row++) {
      for (int col=0; col<3; col++) {
        matrix[row][col] = row + col;
      }
    }

  }
}
