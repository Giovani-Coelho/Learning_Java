package Hackerrank;

import java.util.Arrays;

public class BigSum {
  public static void main(String[] args) {
    long[] arr = {1000000001, 1000000002, 1000000003,1000000004, 1000000005};
    long res;

    res = Arrays.stream(arr).reduce(0,(a, b) -> a + b);

    System.out.println(res);
  }
}
