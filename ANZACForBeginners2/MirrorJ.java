import java.io.*;
import java.util.*;

public class MirrorJ {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      String word = sc.nextLine();
      sc.close();

      getMirrorImage(word);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void getMirrorImage(String word) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      String toInsert = "";

      switch (c) {
        case 'b':
          toInsert = "d";
          break;
        case 'd':
          toInsert = "b";
          break;
        case 'p':
          toInsert = "q";
          break;
        case 'q':
          toInsert = "p";
          break;
        case 'i':
        case 'o':
        case 'v':
        case 'x':
        case 'w':
          toInsert = String.valueOf(c);
          break;
        default:
          System.out.println("INVALID");
          return;
      }
      stringBuilder.insert(0, toInsert);
    }
    String mirrored = stringBuilder.toString();
    System.out.println(mirrored);
  }
}
