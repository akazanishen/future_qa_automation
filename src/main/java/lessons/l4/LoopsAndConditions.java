package lessons.l4;

public class LoopsAndConditions {
  int v;
  public static void main(String[] args) {

    int r;     // declaration of integer r
    {
      int t = 2; // introduction of temporary integer t
      r = 3 * t;
      System.out.println("t = " + t + ", 3*t = " + r);
    }
    ;
    {
      int t = 4; // introduction of new temporary integer t
      r = 5 * t;
      System.out.println("t = " + t + ", 5*t = " + r);
    }
    ;
    int t = 6; // introduction of integer t in the
    // rest of the main method
    r = 7 * t;
    System.out.println("t = " + t + ", 5*t = " + r);

    int moneyOnAccount = 0;
    if (moneyOnAccount > 120) {
      moneyOnAccount -= 120;
      System.out.println("Success");
    } else if (moneyOnAccount == 0) {
      System.out.println("No money");
    } else if (false) {

    } else if (false) {

    } else if (false) {

    } else {
      System.out.println("Not enough money");
    }
    printResponse('o');
      /*
      if (condition) {
        statements
      }
      else {
        statements
      }
      */
    {
      int i = 5;
      while (i > 0) {
        i--;
//      System.out.println("text");
      }

      i = 5;
      do {
        i--;
//        System.out.println("text");
      } while (i > 0);
    }
//    for ( ; ; ) {
//
//    }

//    while (true) {}

    for (int i = 5; i > 0; i--) {
      System.out.println("text");
    }

  }

  static void countCharacters(String s) {
    char[] word = s.toCharArray();
    int countDigits = 0;
    int countNonDigits = 0;
    for (int i = 0; i < word.length; i++) {
      if (Character.isDigit(word[i])) {
        countDigits++;
      } else {
        countNonDigits++;
      }
    }
  }

  static void printResponse(char c) {
    switch (c) {
      case 'y':
      case 'Y':
        System.out.println("Yes");
        break;
      case 'n':
      case 'N':
        System.out.println("No");
        break;
      case 'h':
      case 'H':
      case '?':
        System.out.println("No help available");
        break;
      default:
        System.out.println("Unknown command");
        break;
    }

  }
}
