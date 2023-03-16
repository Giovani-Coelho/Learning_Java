package Lambdas.Predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
  public static void main(String[] args) {
    Predicate<Integer> isPair = num -> num % 2 == 0;
    System.out.println(isPair.test(3));

    Predicate<Integer> isThreeDigits =
            num -> num >= 100 && num <= 999;
    System.out.println(isThreeDigits.and(isPair).test(500));
    System.out.println(isPair.or(isThreeDigits).test(301));
  }
}
