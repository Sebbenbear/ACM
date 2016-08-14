import java.io.*;
import java.util.*;

public class BattleshipB {

  public static final String WATER = "_";
  public static final String SHIP = "#";

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      int w = sc.nextInt();
      int h = sc.nextInt();
      int n = sc.nextInt();

      for (int i = 0; i < h; i++) {  //player 1 deployment map
        //read in w descriptions
      }

      for (int i = 0; i < h; i++) {  //player 2 deployment map
        //read in w descriptions
      }

      sc.close();

      getCalculations(quotient, divisor);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void getResult() {

    System.out.println("player one wins\n");
    System.out.println("player two wins\n");
    System.out.println("draw\n");
  }
}
