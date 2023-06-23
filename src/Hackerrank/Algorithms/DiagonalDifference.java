package Hackerrank.Algorithms;

public class DiagonalDifference {
  public static void main(String[] args) {
    int[][] arr = new int[3][];
    arr[0] = new int[]{11, 2, 4};
    arr[1] = new int[]{4, 5, 6};
    arr[2] = new int[]{10, 8, -12};

    int arrLenght = arr.length - 1;
    int index = 0;
    int left = 0;
    int right = 0;

    for (int[] value : arr) {
      left += value[index];
      index++;
    }

    for (int[] value : arr) {
      right += value[arrLenght];
      arrLenght--;
    }

    System.out.println(Math.abs(left - right));
  }
}
