import java.io.*;
import java.util.*;

public class Arithmetic2 {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      int quotient = sc.nextInt();
      int divisor = sc.nextInt();
      sc.close();

      getCalculations(quotient, divisor);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void getCalculations(int quotient, int divisor) {
    long multicationResult = (long) quotient *  divisor;  //coerce int to be a long
    System.out.printf("%d * %d = %d\n", quotient, divisor, multicationResult);

    if(divisor == 0) {
      System.out.printf("%d / %d is an ILLEGAL OPERATION\n", quotient, divisor);
      return;
    }

    int divisionResult = quotient / divisor;
    int remainder = quotient % divisor;

    System.out.printf("%d / %d = %d remainder %d\n", quotient, divisor, divisionResult, remainder);
  }
}
