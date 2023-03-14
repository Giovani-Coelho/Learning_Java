package Lambdas.Consumer;

import Lambdas.Predicate.Produto;

import java.util.function.Consumer;

public class ConsumerFunction {
  public static void main(String[] args) {

    Consumer<Produto> showThreeTimes = value -> {
      System.out.println(value);
      System.out.println(value);
      System.out.println(value);
    };

    Produto p1 = new Produto("caneta", 2.0, 0.5);

    showThreeTimes.accept(p1);
  }
}
