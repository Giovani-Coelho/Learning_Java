package Hackerrank;

public class CompareTriplets {
  public static void main(String[] args) {
    int[] a = {17, 28, 30};
    int[] b = {99, 16, 8};

    int bob = 0;
    int alice = 0;

    for(int i = 0; i < a.length; i++) {
      if(a[i] > b[i]) {
        alice++;
      } else {
        bob++;
      }
    }

    System.out.println(alice + " " + bob);
  }
}
