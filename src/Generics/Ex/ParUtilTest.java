package Generics.Ex;

public class ParUtilTest {

  public static void main(String[] args) {
    Pares<Integer, String> result = new Pares<>();

    result.add(1,"Giovani");
    result.add(2,"Clara");
    result.add(3,"Julia");
    result.add(2,"Pedro");

    System.out.println(result.getValue(1));
  }
}
