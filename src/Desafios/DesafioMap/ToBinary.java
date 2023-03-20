package Desafios.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ToBinary {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

    UnaryOperator<String> revertString = texto -> new StringBuilder(texto).reverse().toString();

    Function<String, Integer> binaryToInt = txt -> Integer.parseInt(txt, 2);

    nums.stream()
            .map(Integer::toBinaryString)
            .map(revertString)
            .map(binaryToInt)
            .forEach(System.out::println);
  }
}
