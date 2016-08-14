import java.io.*;
import java.util.*;

public class MaximumIncreaseA {

  public static void main(String[] args) {
    //File file = new File("inputA.txt");
    try {
      //Scanner sc = new Scanner(file);
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      int[] array = new int[T];
      int currentNum;

      for (int i = 0; i < T; i++) {
        array[i] = sc.nextInt();
      }

      sc.close();

      int result = printLengthIncreasingSubarray(array);
      System.out.println(result);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static int printLengthIncreasingSubarray(int[] array) {
    int result = 0;
    int count = 0;
    int previousNumber = -1;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > previousNumber) {  //must be strictly increasing
        count++;
        if (count > result) {
          result = count;
        }
      }
      else {
        count = 1;
      }
      previousNumber = array[i];
    }
    return result;
  }
}

/**
===== Description =====
You are given array consisting of n integers. Your task is to find the maximum
length of an increasing subarray of the given array. A subarray is the sequence
of consecutive elements of the array. Subarray is called increasing if each
element of this subarray strictly greater than previous.

===== Input ===========
The first line contains single positive integer n (1 ≤ n ≤ 105) — the number of integers.
The second line contains n positive integers a1, a2, ..., an (1 ≤ ai ≤ 109).

===== Output ==========
Print the maximum length of an increasing subarray of the given array.

===== Sample Input =====
Input
5
1 7 2 11 15
Output
3

Input
6
100 100 100 100 100 100
Output
1

Input
3
1 2 3
Output
3

*/
