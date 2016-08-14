import java.io.*;
import java.util.*;

public class AlyonaAndMexD {

  private static final boolean isTest = false;
  private static final String inputFile = "inputD.txt";

  public static void main(String[] args) {
    try {
      Scanner sc;

      if(isTest) {
        sc = new Scanner(new File(inputFile));
      } else {
        sc = new Scanner(System.in);
      }

      int T = sc.nextInt();
      int[] array = new int[T];

      for (int i = 0; i < T; i++) {
        array[i] = sc.nextInt();
      }

      sc.close();

      int result = getMex(array);
      System.out.println(result);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static int getMex(int[] array) {
    Arrays.sort(array);

    int count = 1;

    for (int i = 0; i < array.length; i++) {
      if(array[i] >= count) {  //if it matches the count
        count++;
      }
    }
    return count;
  }

  // private static void printArray(int[] array) {
  //   System.out.print("[");
  //   for(Integer i : array) {
  //     System.out.printf("%d, ", i);
  //   }
  //   System.out.println("]");
  // }
}
/**

http://acm.hust.edu.cn/vjudge/contest/125541#overview


===== Description =====
MEX: In combinatorial game theory, the mex, or "minimum excludant", of a set of
ordinals denotes the smallest ordinal not contained in the set.

Someone gave Alyona an array containing n positive integers a1, a2, ..., an. In
one operation, Alyona can choose any element of the array and decrease it, i.e.
replace with any positive integer that is smaller than the current one. Alyona
can repeat this operation as many times as she wants. In particular, she may
not apply any operation to the array at all.

Formally, after applying some operations Alyona will get an array of n positive
integers b1, b2, ..., bn such that 1 ≤ bi ≤ ai for every 1 ≤ i ≤ n. Your task
is to determine the maximum possible value of mex of this array.

Mex of an array in this problem is the minimum positive integer that doesn't
appear in this array. For example, mex of the array containing 1, 3 and 4 is
equal to 2, while mex of the array containing 2, 3 and 2 is equal to 1.

===== Input ===========
The first line of the input contains a single integer n (1 ≤ n ≤ 100 000) — the
number of elements in the Alyona's array.

The second line of the input contains n integers a1, a2, ..., an (1 ≤ ai ≤ 109)
— the elements of the array.

===== Output ==========
Print one positive integer — the maximum possible value of mex of the array
after Alyona applies some (possibly none) operations.

===== Sample Input =====
Input
5
1 3 3 3 6
Output
5

Input
2
2 1
Output
3


*/
