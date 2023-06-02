package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {
  public static void main(String[] args) {
    int[] arr = {7, 69, 2, 221, 8974};
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      int acc = 0;
      for (int j = 0; j < arr.length; j++) {
        if(i == j) {
          continue;
        }
        if(j == arr.length -1) {
          res.add(acc += arr[j]);
          acc = 0;
        }
        acc += arr[j];
      }
      if(i == arr.length -1) {
        res.add(acc);
      }
    }

    int max = 0;
    int min = 0;

    for (int i = 0; i < arr.length; i++) {
      min = res.get(i);
      if(res.get(i) > max) {
        max = res.get(i);
      }
      if(res.get(i) < min) {
        min = res.get(i);
      }
    }

    System.out.println(min + " " + max);
  }
}
