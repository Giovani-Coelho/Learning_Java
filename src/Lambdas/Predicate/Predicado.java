package Lambdas.Predicate;

import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {
    Predicate<Produto> isCaro =
            prod -> (prod.preco * (1 - prod.desconto)) >= 3000;

    Produto produto = new Produto("PC", 5000, 0.15);
    System.out.println(isCaro.test(produto));
  }
}
