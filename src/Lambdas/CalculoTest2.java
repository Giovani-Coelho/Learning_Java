package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;

public class CalculoTest2 {
  public static void main(String[] args) {
    BinaryOperator<Double> soma = (x, y) -> x + y;
    System.out.println(soma.apply(2.0, 5.0));

    Calculo mult = (x, y) -> x * y;
    System.out.println(mult.executar(10, 2));
  }
}
