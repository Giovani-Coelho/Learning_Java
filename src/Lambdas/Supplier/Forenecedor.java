package Lambdas.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Forenecedor {
  public static void main(String[] args) {
    // nao recebe nada, mas retorna algo.
    Supplier<List<String>> aList =
            () -> Arrays.asList("Giovani", "Coelho", "Aguiar");
    System.out.println(aList.get());
  }
}
