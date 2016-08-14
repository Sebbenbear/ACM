import java.io.*;
import java.util.*;

public class BrothersDiary_G {

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

      for (int i = 0; i < numTests; i++) {
         getDecryption(words[i]);
      }

      sc.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void getDecryption(String str) {
    HashMap<Character, Integer> characterToFrequency = new HashMap<>();

    for (int j = 0; j < str.length(); j++) {
      char c = str.charAt(j);
      if (c == ' ') {
        continue;
      }
      if (characterToFrequency.containsKey(c)) {
        int value = characterToFrequency.get(c) + 1;  //increment frequency
        characterToFrequency.put(c, value); //put it back in the hashmap for next time
      } else {
        characterToFrequency.put(c, 1);
      }
    }

    int firstMaxFrequency = -1;
    char firstMaxChar = 'a';

    int secondMaxFrequency = -1;
    char secondMaxChar = 'a'; //might have an edge case

    for (char c : characterToFrequency.keySet()) {
      int value = characterToFrequency.get(c);
      if (value >= firstMaxFrequency) {
        if(secondMaxChar != firstMaxChar) {
          secondMaxChar = firstMaxChar;
          secondMaxFrequency = firstMaxFrequency;
        }

        firstMaxFrequency = value;
        firstMaxChar = c;
      }
    }

    // we now have the distance
    if (firstMaxFrequency == secondMaxFrequency) {
      System.out.println("NOT POSSIBLE");
      return;
    }
    getDistance(str, firstMaxChar);
  }

  private static void getDistance(String str, char character) {
    StringBuilder stringBuilder = new StringBuilder();

    int distance = 'E' - character;

    int printDistance = Math.abs('E' - character);

    if (distance < 0) {
      distance += 26;
    }

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if  (c == ' ') {
          //do nothing
        } else {
          c += distance;
          if (c > 'Z') {
            c-= 26;
          }
        }
        stringBuilder.append(c);
      }
    //System.out.printf("%c at %d\n", character, distance);
    System.out.println(printDistance + " " + stringBuilder.toString());
  }
}
