package Hackerrank;

public class Staircase {
  public static void main(String[] args) {
    int n = 6;

    for (int i = 1; i <= n; i++) {
      String spaces = " ".repeat(n - i);
      String symbols = "#".repeat(i);
      System.out.println(spaces + symbols);
    }
  }
}
