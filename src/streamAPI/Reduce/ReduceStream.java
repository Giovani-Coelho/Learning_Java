package streamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

    BinaryOperator<Integer> soma = (acc, val) -> acc += val;

    // retorna 45, com o valor inicial de 100 vai para 145
    int total = nums.stream().reduce(100, soma);
    // aqui fala que quando for somar vai levar em conta o valor 100,
    // entao cada valor do array sera equivalente a + 100.
    // return 945
    int total2 = nums.parallelStream().reduce(100, soma);
    System.out.println(total2);

    nums.stream()
            .filter(n -> n > 5)
            .reduce(soma)
            // se tiver resultado:
            .ifPresent(System.out::println);
  }
}
