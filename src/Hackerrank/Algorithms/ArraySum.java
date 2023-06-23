package Hackerrank.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
  public static void main(String[] args) {
    List<Integer> arr =List.of(1,2,3,4,5,6,7);
    int res = 0;

    res = arr.stream().reduce(0,(x , y) -> x + y);

    System.out.println(res);
  }
}
