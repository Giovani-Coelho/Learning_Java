package Generics.ListUtil;

import java.util.List;

public class ListUtil {

  public static Object lastValue(List<?> list) {
    return list.get(list.size() - 1);
  }

  public static <T> T lastValue2(List<T> list) {
    return list.get(list.size() - 1);
  }

  public static <A, B, C> C sla(A obj, B obj1, C obj3) {
    return obj3;
  }
}
