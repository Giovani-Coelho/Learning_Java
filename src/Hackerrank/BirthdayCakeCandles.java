package Hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {
  public static void main(String[] args) {
    List<Integer> can =  Arrays.asList(3,2,1,3);

    int max = can.stream().filter(candle -> candle >= 0).max(Comparator.comparingInt(a -> a)).orElse(0);

    int res = 0;

    for(int num : can) {
      if(num == max) res++;
    }

    System.out.println(res);
  }
}
