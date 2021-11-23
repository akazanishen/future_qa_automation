package lessons.l9;

public class StaticTest {

    public Spouse spouse;
    public SpouseStatic spouseStatic;
//    public SpouseNonStatic spouseNonStatic;


    public class Spouse {
        String firstName;
    }

    public static class SpouseStatic {
        static String firstName;
    }

//    public class SpouseNonStatic {
//        static String firstName;
//    }
}
