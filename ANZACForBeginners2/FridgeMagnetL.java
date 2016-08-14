import java.io.*;
import java.util.*;

public class FridgeMagnetL {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      while (sc.hasNextLine()) {
        String line = sc.nextLine();

        if (line.equals("END")) {
          return;
        }
        printIfValid(line);
      }
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
