package lessons.l11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Operationable op = new Operationable(){

            public int calculate(int x, int y){
                return x + y;
            }
        };

        Operationable operation1 = (int x, int y)-> {
            System.out.println(11);
            return x + y;
        };
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (x, y)-> x * y;

        OperationableUpdated operation4 = x-> x*2;

        System.out.println(operation4.calculate(20)); //40


        System.out.println(op.calculate(20, 110)); //30

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200


        List<List<String>> complexList = new ArrayList<>();





    }
}
