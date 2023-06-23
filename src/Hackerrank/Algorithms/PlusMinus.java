package Hackerrank.Algorithms;

import java.text.DecimalFormat;

public class PlusMinus {
  public static void main(String[] args) {
    DecimalFormat format = new DecimalFormat("0.000000");
    int[] arr = {-4, 3, -9, 0, 4, 1};

    int arrLenght = arr.length;
    double pos = 0;
    double zero = 0;
    double neg = 0;

    for (int num : arr) {
      if (num < 0) neg++;
      if(num > 0) pos++;
      if(num == 0) zero++;
    }

    pos /= arrLenght;
    neg /= arrLenght;
    zero /= arrLenght;

    System.out.println(format.format(pos));
    System.out.println(format.format(neg));
    System.out.println(format.format(zero));

  }
}
