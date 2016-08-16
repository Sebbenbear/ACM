import java.io.*;
import java.util.*;

public class A {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);
      int k = sc.nextInt();

      // hashset for constant lookup
      HashSet<Integer> numbers = isTriangular(k);  //use a set for constant lookup

      // find the smaller number
      int lValue = 1;

      for (int i : numbers) {
        int rValue = k - i;
        if (numbers.contains(rValue)) {
          System.out.println("YES");
          return;
        }
      }
      System.out.println("NO");
      sc.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  /**
   */
  private static HashSet<Integer> isTriangular(int k) {
    HashSet<Integer> numbers = new HashSet<Integer>();
    int result = -1;
    for (int i = 1; i <= k; i++) {
      result = (i*(i+1)) / 2;

      if (result >= k) {
        return numbers;
      } else {
        numbers.add(result);
      }
    }
    return numbers;
  }
}
