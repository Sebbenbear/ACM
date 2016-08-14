import java.io.*;
import java.util.*;

public class DeathKnightH {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      int numTests = sc.nextInt();
      sc.nextLine();

      String[] words = new String[numTests];
      for (int i = 0; i < numTests; i++) {
         words[i] = sc.nextLine();
      }
      sc.close();

      getBattlesWon(words);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void getBattlesWon(String[] words) {
    int result = 0;
    for (int i = 0; i < words.length; i++) {
      result += battleWon(words[i]);
    }
    System.out.println(result);
  }

  private static int battleWon(String word) {
    if (word.length() == 1) {
      return 1;
    }

    char previousChar = word.charAt(0);
    for (int i = 1; i < word.length(); i++) {
      char currentChar = word.charAt(i);
      if (previousChar == 'C' && currentChar == 'D') {
        return 0;
      }
      previousChar = currentChar;
    }
    return 1;
  }
}
