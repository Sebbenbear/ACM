import java.io.*;
import java.util.*;

public class Doorman_D {

  public static void main(String[] args) {
    try {
      Scanner sc;
      sc = new Scanner(System.in);

      // X < 100, most people allowed in the club
      int allowedDifference = sc.nextInt();
      sc.nextLine();
      // the men and women lined up outside the club
      char[] people = sc.nextLine().toCharArray();

      findLargestNumberOfPeople(allowedDifference, people);

      sc.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  /**
   */
  private static void findLargestNumberOfPeople(int allowedDifference, char[] people) {
    int men = 0;
    int women = 0;

    int i = 0;
    while (i < people.length) {
      char currentPerson = people[i];
      if (currentPerson == 'M') {
        men++;
      } else {
        women++;
      }

      int actualDifference = Math.abs(men - women);

      if (actualDifference > allowedDifference) {   // check this, otherwise it's fine
        if (i + 1 < people.length) {                // otherwise go off end of array
          if (people[i] != people[i + 1]) {         // if they aren't equal, swap them
            people = swap(i, people);
            // if continue, will swap back and forth
            if (people[i] == 'M') {
              men++;
            } else {
              women++;
            }
          } else {  //otherwise it's the same gender
            System.out.printf("EXCEEDED: %d\n", men+women-1);  //to account for the person we just added
            return;
          }
        }
      }
      i++;
    }
    System.out.println(men + women);  //otherwise we can have everyone
  }

  /**
   Swap a person in the line.
  */
  private static char[] swap(int index, char[] people) {
    char tmp = people[index];
    people[index] = people[index+1];
    people[index+1] = tmp;
    return people;
  }
}
