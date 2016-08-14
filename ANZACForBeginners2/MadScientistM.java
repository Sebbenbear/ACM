import java.io.*;
import java.util.*;

public class MadScientistM {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      String line = sc.nextLine();
      String[] numberStrings = line.split("\\s+");
      int[] numberArray = new int[numberStrings.length];

      for (int i = 0; i < numberStrings.length; i++) {
        numberArray = Integer.parseInt(numberStrings[i]);
      }

      printIfValid(numberArray);

      sc.close();

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void printIfValid(String word) {

    HashSet<Character> characters = new HashSet<Character>();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (c == ' ') {
        continue;
      }

      if (characters.contains(c)) {
        return;  // don't print it
      }
      characters.add(c);
    }
    System.out.println(word.toString());
  }
}
