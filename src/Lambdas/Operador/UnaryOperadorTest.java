package Lambdas.Operador;

import java.util.function.UnaryOperator;

public class UnaryOperadorTest {
  public static void main(String[] args) {
    UnaryOperator<Integer> maisDois = n -> n + 2;
    UnaryOperator<Integer> vezesDois = n -> n * 2;
    UnaryOperator<Integer> quadrado = n -> n * n;

    int resuldado1 = maisDois
            .andThen(vezesDois)
            .andThen(quadrado)
            .apply(4);

    System.out.println(resuldado1);
  }
}
