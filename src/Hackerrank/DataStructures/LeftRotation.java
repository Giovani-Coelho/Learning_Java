package Hackerrank.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
  public static void main(String[] args) {
    int rot = 2;
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);

    for(int i = 0; i < rot; i++) {
      int index = arr.get(0);
      arr.remove(0);
      arr.add(index);
    }

    for(int x : arr) {
      System.out.println(x);
    }
  }
}
