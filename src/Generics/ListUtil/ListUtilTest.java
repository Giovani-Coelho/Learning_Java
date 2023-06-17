package Generics.ListUtil;

import java.util.Arrays;
import java.util.List;

public class ListUtilTest {
  public static void main(String[] args) {
    List<Integer> numbs = Arrays.asList(1,2,3,4,5,6);

    Integer lastVal = (Integer) ListUtil.lastValue(numbs);
    System.out.println(lastVal);

    // Generics in method
    Integer lastVal2 = ListUtil.lastValue2(numbs);
    System.out.println(lastVal2);
  }
}
