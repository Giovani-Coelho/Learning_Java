package Hackerrank.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
  public static void main(String[] args) {
    List<List<Integer>> queries = new ArrayList<>();
    int n = 2;

    queries.add(Arrays.asList(1, 0, 5));
    queries.add(Arrays.asList(1, 1, 7));
    queries.add(Arrays.asList(1, 0, 3));
    queries.add(Arrays.asList(2, 1, 0));
    queries.add(Arrays.asList(2, 1, 1));

    List<List<Integer>> arr = new ArrayList<>();
    int lastAnswer = 0;

    for(int i = 0; i < n; i++) {
      arr.add(new ArrayList<>());
    }

    List<Integer> answers = new ArrayList<>();

    for(List<Integer> q : queries) {
      int queryType = q.get(0);
      int x = q.get(1);
      int y = q.get(2);
      int idx = (x ^ lastAnswer) % n;

      if(queryType == 1) {
        arr.get(idx).add(y);
      } else {
        lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
        answers.add(lastAnswer);
      }
    }

    System.out.println(answers);
  }
}
